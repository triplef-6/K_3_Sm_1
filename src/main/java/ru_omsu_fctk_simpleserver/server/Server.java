package ru_omsu_fctk_simpleserver.server;

import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.controllers.student.ControllerStudent;
import ru_omsu_fctk_simpleserver.exception.ServerException;
import ru_omsu_fctk_simpleserver.repositories.DataBase;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;
import ru_omsu_fctk_simpleserver.server.handlers.group.*;
import ru_omsu_fctk_simpleserver.server.handlers.student.*;
import ru_omsu_fctk_simpleserver.services.group.*;
import ru_omsu_fctk_simpleserver.services.student.*;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private static Map<String, EndpointHandler> endpointMap;
    private static ControllerGroup controllerGroup;
    private static ControllerStudent controllerStudent;

    static {
        DataBase dataBase = new DataBase();
        RepositoryGroup repositoryGroup = new RepositoryGroup(dataBase);
        RepositoryStudent repositoryStudent = new RepositoryStudent(dataBase);

        AddStudentGroupsService addStudentGroupsService = new AddStudentGroupsService(repositoryGroup);
        DeleteStudentGroupService deleteStudentGroupService = new DeleteStudentGroupService(repositoryGroup);
        EditStudentGroupsService editStudentGroupsService = new EditStudentGroupsService(repositoryGroup);
        GetStudentGroupByIdService getStudentGroupByIdService = new GetStudentGroupByIdService(repositoryGroup);
        GetStudentGroupsService getStudentGroupsService = new GetStudentGroupsService(repositoryGroup);

        AddStudentService addStudentService = new AddStudentService(repositoryStudent);
        DeleteStudentService deleteStudentService = new DeleteStudentService(repositoryStudent);
        EditStudentService editStudentService = new EditStudentService(repositoryStudent);
        GetStudentByGroupService getStudentByGroupService = new GetStudentByGroupService(repositoryStudent);
        GetStudentByIdService getStudentByIdService = new GetStudentByIdService(repositoryStudent);

        controllerGroup = new ControllerGroup(addStudentGroupsService,
                deleteStudentGroupService,
                editStudentGroupsService,
                getStudentGroupsService,
                getStudentGroupByIdService);
        controllerStudent = new ControllerStudent(addStudentService,
                editStudentService,
                deleteStudentService,
                getStudentByIdService,
                getStudentByGroupService);

        endpointMap = new HashMap<>();

        endpointMap.put("addStudentGroups", new AddStudentGroupsHandler(controllerGroup));
        endpointMap.put("getStudentGroups", new GetStudentGroupsHandler(controllerGroup));
        endpointMap.put("deleteStudentGroup", new DeleteStudentGroupHandler(controllerGroup));
        endpointMap.put("editStudentGroups", new EditStudentGroupsHandler(controllerGroup));
        endpointMap.put("getStudentGroupById", new GetStudentGroupByIdHandler(controllerGroup));

        endpointMap.put("addStudent", new AddStudentHandler(controllerStudent));
        endpointMap.put("getStudentByGroup", new GetStudentByGroupHandler(controllerStudent));
        endpointMap.put("deleteStudent", new DeleteStudentHandler(controllerStudent));
        endpointMap.put("editStudent", new EditStudentHandler(controllerStudent));
        endpointMap.put("getStudentById", new GetStudentByIdHandler(controllerStudent));
    }

    public Server() {
    }

    public Writer executeRequest(Reader reader) throws ServerException {
        if (endpointMap.containsKey(reader.getEndpoint())) {
            throw new ServerException("Неправельный запрос");
        }
        try {
            return new Writer(endpointMap.get(reader.getEndpoint()).handel(reader.getJson()));
        } catch (Exception e){
            throw new ServerException(e.getMessage());
        }
    }
}
