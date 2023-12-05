package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.Group;

import java.util.List;

public class RepositoryGroup implements IRepositoryGroup {
    private DataBase base;

    public RepositoryGroup(DataBase base) {
        this.base = base;
    }

    @Override
    public long addStudentGroup(Group group) {
        long groupId = base.nextGroupId();
        base.getGroupMap().put(groupId, group);
        return groupId;
    }

    @Override
    public void editStudentGroup(Group group) {
        if (!base.getGroupMap().containsKey(group.getId())) {
            throw new RuntimeException("Нет объекта с данным id");
        }
        base.getGroupMap().get(group.getId()).set(group);
    }

    @Override
    public void deleteStudentGroup(long id) {
        if (!base.getGroupMap().containsKey(id)) {
            throw new RuntimeException("Нет объекта с данным id");
        }
        base.getGroupMap().remove(id);
    }

    @Override
    public Group getStudentGroupById(long id) {
        if (!base.getGroupMap().containsKey(id)) {
            throw new RuntimeException("Нет объекта с данным id");
        }
        return base.getGroupMap().get(id);
    }

    @Override
    public List<Group> getStudentGroups() {
        return base.getGroupMap().values().stream().toList();
    }
}
