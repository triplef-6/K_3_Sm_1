package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.Subject;

import java.util.List;

public class RepositorySubject implements IRepositorySubject {
    private DataBase base;

    public RepositorySubject(DataBase base) {
        this.base = base;
    }

    @Override
    public long addSubject(Subject subject) {
        long subjectId = base.nextGroupId();
        base.getSubjectMap().put(subjectId, subject);
        return subjectId;
    }

    @Override
    public void editSubject(Subject subject) {
        System.out.println("Изменино(типа)");
    }

    @Override
    public void deleteSubject(long id) {
        if (!base.getSubjectMap().containsKey(id)) {
            throw new RuntimeException("Нет объекта с данным id");
        }
        base.getSubjectMap().remove(id);
    }

    @Override
    public Subject getSubjectById(long id) {
        return base.getSubjectMap().get(id);
    }

    @Override
    public List<Subject> getSubjects() {
        return base.getSubjectMap().values().stream().toList();
    }
}