package repositories;

import essence.Group;

import java.util.List;

public interface IRepositoryGroup {
    /** обавление новой группы
     * @param group группы (с id == null)
     * @return id (!= null) добавленой группы
     */
    long addStudentGroup(Group group);

    /**
     * редактирование группы
     * @param group группа (с id != null)
     */
    void editStudentGroup(Group group);

    /**
     * удаление группы
     * @param id id группы
     */
    void deleteStudentGroup(long id);

    /**
     * получение группы по id
     * @param id id группы
     * @return группа
     */
    Group getStudentGroupById(long id);

    /**
     * получение всех групп
     * @return список всех групп
     */
    List<Group> getStudentGroups();
}
