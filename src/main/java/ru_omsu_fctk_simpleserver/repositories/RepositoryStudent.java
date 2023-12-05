package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class RepositoryStudent implements IRepositoryStudent {
    private DataBase base;

    public RepositoryStudent(DataBase base) {
        this.base = base;
    }

    @Override
    public long addStudent(Student student) {
        long studentId = base.nextStudentId();
        base.getStudentMap().put(studentId, student);
        return studentId;
    }

    @Override
    public void editStudent(Student student) {
        if (!base.getStudentMap().containsKey(student.getId())) {
            throw new RuntimeException("Нет объекта с данным id");
        }
        base.getStudentMap().get(student.getId()).set(student);
    }

    @Override
    public void deleteStudent(long id) {
        if (!base.getStudentMap().containsKey(id)) {
            throw new RuntimeException("Нет объекта с данным id");
        }
        base.getStudentMap().remove(id);
    }

    @Override
    public Student getStudentById(long id) {
        if (!base.getStudentMap().containsKey(id)) {
            throw new RuntimeException("Нет объекта с данным id");
        }
        return base.getStudentMap().get(id);
    }

    @Override
    public List<Student> getStudentByGroup(long idGroup) {
        if (!base.getGroupMap().containsKey(idGroup)) {
            throw new RuntimeException("Нет объекта с данным id");
        }
        List<Student> studentsInGroup = new ArrayList<>();
        for (Map.Entry<Long, Student> m : base.getStudentMap().entrySet()) {
            if (m.getValue().getGroupId() == idGroup) {
                studentsInGroup.add(m.getValue());
            }
        }
        return studentsInGroup;
    }
}
