package ru_omsu_fctk_simpleserver.validators.repositories;

import ru_omsu_fctk_simpleserver.validators.essence.Subject;

import java.util.List;

public class RepositorySubject implements IRepositorySubject {
    private DataBase base;

    @Override
    public long addSubject(Subject subject) {
        System.out.println("Добавлено(типа)");
        return 6;
    }

    @Override
    public void editSubject(Subject subject) {
        System.out.println("Изменино(типа)");
    }

    @Override
    public void deleteSubject(long id) {
        System.out.println("Удалено(типа)");
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