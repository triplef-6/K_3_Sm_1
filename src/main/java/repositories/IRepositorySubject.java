package repositories;

import essence.Subject;

import java.util.List;

public interface IRepositorySubject {
    /** обавление новой дисцеплины
     * @param subject дисцеплина (с id == null)
     * @return id (!= null) добавленой дисцеплины
     */
    long addSubject(Subject subject);

    /**
     * редактирование дисцеплины
     * @param subject дисцеплина (с id != null)
     */
    void editSubject(Subject subject);

    /**
     * удаление дисцеплины
     * @param id id дисцеплины
     */
    void deleteSubject(long id);

    /**
     * получение дисцеплины по id
     * @param id id дисцеплины
     * @return дисцеплина
     */
    Subject getSubjectById(long id);

    /**
     * получение всех дисцеплин
     * @return список всех дисцеплин
     */
    List<Subject> getSubjects();
}
