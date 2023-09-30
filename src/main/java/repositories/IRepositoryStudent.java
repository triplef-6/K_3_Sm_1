package repositories;

import essence.Student;

import java.util.List;

public interface IRepositoryStudent {
    /**
     * добавление студента
     * @param student студент (с id == null)
     * @return id (!= null) добавленого студента
     */
    long addStudent(Student student);

    /**
     * редактирование студента
     * @param student студент (с id != null)
     */
    void editStudent(Student student);

    /**
     * удаление студента
     * @param id id студента
     */
    void deleteStudent(long id);

    /**
     * получение студента по id
     * @param id id студента
     * @return студент
     */
    Student getStudentById(long id);

    /**
     * получение студентов по id группы
     * @param idGroup id группы
     * @return список студентов из группы
     */
    List<Student> getStudentByGroup(long idGroup);
}
