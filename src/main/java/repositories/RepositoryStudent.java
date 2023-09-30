package repositories;

import essence.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * заглушка
 */
public class RepositoryStudent implements IRepositoryStudent {
    private DataBase base;

    @Override
    public long addStudent(Student student) {
        System.out.println("Добавлено(типа)");
        return 6;
    }

    @Override
    public void editStudent(Student student) {
        System.out.println("Изменино(типа)");
    }

    @Override
    public void deleteStudent(long id) {
        System.out.println("Удалено(типа)");
    }

    @Override
    public Student getStudentById(long id) {
        return base.getStudentMap().get(id);
    }

    @Override
    public List<Student> getStudentByGroup(long idGroup) {
        List<Student> studentsInGroup = new ArrayList<>();
        for (Map.Entry<Long, Student> m : base.getStudentMap().entrySet()) {
            if (m.getValue().getGroupId() == idGroup) {
                studentsInGroup.add(m.getValue());
            }
        }
        return studentsInGroup;
    }
}
