package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.Teacher;

import java.util.List;

public interface IRepositoryTeacher {
    /**
     * добавление преподавателя
     * @param teacher преподаватель (с id == null)
     * @return id (!= null) добавленого преподавателя
     */
    long addTeacher(Teacher teacher);

    /**
     * редактирование преподавателя
     * @param teacher преподаватель (с id != null)
     */
    void editTeacher(Teacher teacher);

    /**
     * удаление преподавателя
     * @param id id преподавателя
     */
    void deleteTeacher(long id);

    /**
     * получение преподавателя по id
     * @param id id преподавателя
     * @return преподаватель
     */
    Teacher getTeacherById(long id);

    /**
     * получение всех преподавателей
     * @return список всех преподавателей
     */
    List<Teacher> getTeachers();
}
