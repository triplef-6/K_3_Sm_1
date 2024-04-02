package ru_omsu_fctk_simpleserver.server;

import ru_omsu_fctk_simpleserver.controllers.ControllerAudience;
import ru_omsu_fctk_simpleserver.controllers.ControllerSubject;
import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.controllers.student.ControllerStudent;
import ru_omsu_fctk_simpleserver.exception.ServerException;
import ru_omsu_fctk_simpleserver.repositories.*;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;
import ru_omsu_fctk_simpleserver.server.handlers.audience.AddAudienceHandler;
import ru_omsu_fctk_simpleserver.server.handlers.audience.GetAudiencesHandler;
import ru_omsu_fctk_simpleserver.server.handlers.group.*;
import ru_omsu_fctk_simpleserver.server.handlers.student.*;
import ru_omsu_fctk_simpleserver.server.handlers.subject.AddSubjectHandler;
import ru_omsu_fctk_simpleserver.server.handlers.subject.DeleteSubjectHandler;
import ru_omsu_fctk_simpleserver.services.audience.AddAudienceService;
import ru_omsu_fctk_simpleserver.services.audience.GetAudiencesService;
import ru_omsu_fctk_simpleserver.services.group.*;
import ru_omsu_fctk_simpleserver.services.student.*;
import ru_omsu_fctk_simpleserver.services.subject.AddSubjectService;
import ru_omsu_fctk_simpleserver.services.subject.DeleteSubjectService;
import ru_omsu_fctk_simpleserver.validator.audience.AddAudienceValidator;
import ru_omsu_fctk_simpleserver.validator.group.*;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidateString;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorInt;
import ru_omsu_fctk_simpleserver.validator.student.*;
import ru_omsu_fctk_simpleserver.validator.subject.AddSubjectValidator;
import ru_omsu_fctk_simpleserver.validator.subject.DeleteSubjectValidator;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, EndpointHandler> endpointMap;
    private DataBase dataBase;
    private ControllerGroup controllerGroup;
    private ControllerStudent controllerStudent;
    private ControllerSubject controllerSubject;

    public Server() {
        this.dataBase = new DataBase();
        this.endpointMap = new HashMap<>();

        System.out.println("Server launched");
    }

    public void initGroup() {
        RepositoryGroup repositoryGroup = new RepositoryGroup(dataBase);

        ValidatorId validatorId = new ValidatorId();
        ValidateString validateString = new ValidateString();

        AddStudentGroupsValidator addStudentGroupsValidator = new AddStudentGroupsValidator(validateString);
        DeleteStudentGroupValidator deleteStudentGroupValidator = new DeleteStudentGroupValidator(validatorId);
        EditStudentGroupsValidator editStudentGroupsValidator = new EditStudentGroupsValidator(validateString, validatorId);
        GetStudentGroupByIdValidator getStudentGroupByIdValidator = new GetStudentGroupByIdValidator(validatorId);

        AddStudentGroupsService addStudentGroupsService = new AddStudentGroupsService(repositoryGroup);
        DeleteStudentGroupService deleteStudentGroupService = new DeleteStudentGroupService(repositoryGroup);
        EditStudentGroupsService editStudentGroupsService = new EditStudentGroupsService(repositoryGroup);
        GetStudentGroupByIdService getStudentGroupByIdService = new GetStudentGroupByIdService(repositoryGroup);
        GetStudentGroupsService getStudentGroupsService = new GetStudentGroupsService(repositoryGroup);

        controllerGroup = new ControllerGroup(addStudentGroupsService,
                deleteStudentGroupService,
                editStudentGroupsService,
                getStudentGroupsService,
                getStudentGroupByIdService,
                addStudentGroupsValidator,
                editStudentGroupsValidator,
                deleteStudentGroupValidator,
                getStudentGroupByIdValidator);

        endpointMap.put("addStudentGroups", new AddStudentGroupsHandler(controllerGroup));
        endpointMap.put("getStudentGroups", new GetStudentGroupsHandler(controllerGroup));
        endpointMap.put("deleteStudentGroup", new DeleteStudentGroupHandler(controllerGroup));
        endpointMap.put("editStudentGroups", new EditStudentGroupsHandler(controllerGroup));
        endpointMap.put("getStudentGroupById", new GetStudentGroupByIdHandler(controllerGroup));

        System.out.println("Group init");
    }

    public void initStudent() {
        RepositoryStudent repositoryStudent = new RepositoryStudent(dataBase);

        ValidatorId validatorId = new ValidatorId();
        ValidateString validateString = new ValidateString();

        AddStudentValidator addStudentValidator = new AddStudentValidator(validateString, validatorId);
        DeleteStudentValidator deleteStudentValidator = new DeleteStudentValidator(validatorId);
        EditStudentValidator editStudentValidator = new EditStudentValidator(validateString, validatorId);
        GetStudentByGroupValidator getStudentByGroupValidator = new GetStudentByGroupValidator(validatorId);
        GetStudentByIdValidator getStudentByIdValidator = new GetStudentByIdValidator(validatorId);

        AddStudentService addStudentService = new AddStudentService(repositoryStudent);
        DeleteStudentService deleteStudentService = new DeleteStudentService(repositoryStudent);
        EditStudentService editStudentService = new EditStudentService(repositoryStudent);
        GetStudentByGroupService getStudentByGroupService = new GetStudentByGroupService(repositoryStudent);
        GetStudentByIdService getStudentByIdService = new GetStudentByIdService(repositoryStudent);

        controllerStudent = new ControllerStudent(addStudentService,
                editStudentService,
                deleteStudentService,
                getStudentByIdService,
                getStudentByGroupService,
                addStudentValidator,
                editStudentValidator,
                deleteStudentValidator,
                getStudentByIdValidator,
                getStudentByGroupValidator);

        endpointMap.put("addStudent", new AddStudentHandler(controllerStudent));
        endpointMap.put("getStudentByGroup", new GetStudentByGroupHandler(controllerStudent));
        endpointMap.put("deleteStudent", new DeleteStudentHandler(controllerStudent));
        endpointMap.put("editStudent", new EditStudentHandler(controllerStudent));
        endpointMap.put("getStudentById", new GetStudentByIdHandler(controllerStudent));

        System.out.println("Student init");
    }

    public void initSubject() {
        RepositorySubject repositorySubject = new RepositorySubject(dataBase);

        ValidatorId validatorId = new ValidatorId();
        ValidateString validateString = new ValidateString();

        AddSubjectValidator addSubjectValidator = new AddSubjectValidator(validateString);
        DeleteSubjectValidator deleteSubjectValidator = new DeleteSubjectValidator(validatorId);


        AddSubjectService addStudentGroupsService = new AddSubjectService(repositorySubject);
        DeleteSubjectService deleteStudentGroupService = new DeleteSubjectService(repositorySubject);


        controllerSubject = new ControllerSubject(addStudentGroupsService,
                deleteStudentGroupService,
                addSubjectValidator,
                deleteSubjectValidator);

        endpointMap.put("addSubject", new AddSubjectHandler(controllerSubject));
        endpointMap.put("deleteSubject", new DeleteSubjectHandler(controllerSubject));

        System.out.println("Subject init");
    }
    public void initAudience() {
        RepositoryAudience repositoryAudience = new RepositoryAudience(dataBase);

        ValidatorInt validatorInt = new ValidatorInt();
        ValidateString validateString = new ValidateString();

        AddAudienceValidator addAudienceValidator = new AddAudienceValidator(validateString, validatorInt);


        AddAudienceService addAudienceService = new AddAudienceService(repositoryAudience);
        GetAudiencesService getAudiencesService = new GetAudiencesService(repositoryAudience);


        ControllerAudience controllerAudience= new ControllerAudience(addAudienceService,
                getAudiencesService,
                addAudienceValidator);

        endpointMap.put("addAudience", new AddAudienceHandler(controllerAudience));
        endpointMap.put("getAudiences", new GetAudiencesHandler(controllerAudience));

        System.out.println("Audience init");



    }

    public Writer executeRequest(Reader reader) throws ServerException {
        if (!endpointMap.containsKey(reader.getEndpoint())) {
            throw new ServerException("Неправельный запрос");
        }
        try {
            return new Writer(endpointMap.get(reader.getEndpoint()).handel(reader.getJson()));
        } catch (Exception e) {
            throw new ServerException(e.getMessage());
        }
    }
}
