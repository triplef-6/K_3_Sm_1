package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.Group;

import java.util.List;

/**
 * заглушка
 */
public class RepositoryGroup implements IRepositoryGroup {
    private DataBase base;

    @Override
    public long addStudentGroup(Group group) {
        System.out.println("Добавлено(типа)");
        return 6;
    }

    @Override
    public void editStudentGroup(Group group) {
        System.out.println("Изменино(типа)");
    }

    @Override
    public void deleteStudentGroup(long id) {
        System.out.println("Удалено(типа)");
    }

    @Override
    public Group getStudentGroupById(long id) {
        return base.getGroupMap().get(id);
    }

    @Override
    public List<Group> getStudentGroups() {
        return base.getGroupMap().values().stream().toList();
    }
}
