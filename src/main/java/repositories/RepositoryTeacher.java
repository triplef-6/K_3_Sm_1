package repositories;

import essence.Teacher;

import java.util.List;

/**
 * заглушка
 */
public class RepositoryTeacher implements IRepositoryTeacher {
    private DataBase base;

    @Override
    public long addTeacher(Teacher teacher) {
        System.out.println("Добавлено(типа)");
        return 6;
    }

    @Override
    public void editTeacher(Teacher teacher) {
        System.out.println("Изменино(типа)");
    }

    @Override
    public void deleteTeacher(long id) {
        System.out.println("Удалено(типа)");
    }

    @Override
    public Teacher getTeacherById(long id) {
        return base.getTeacherMap().get(id);
    }

    @Override
    public List<Teacher> getTeachers() {
        return base.getTeacherMap().values().stream().toList();
    }
}
