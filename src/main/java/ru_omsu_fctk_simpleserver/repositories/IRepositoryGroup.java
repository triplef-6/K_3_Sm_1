package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.Group;
import ru_omsu_fctk_simpleserver.exception.RepositoryException;

import java.util.List;

public interface IRepositoryGroup {
    /** обавление новой группы
     * @param group группы (с id == null)
     * @return id (!= null) добавленой группы
     */
    long addStudentGroup(Group group) throws RepositoryException;

    /**
     * редактирование группы
     * @param group группа (с id != null)
     */
    void editStudentGroup(Group group) throws RepositoryException;

    /**
     * удаление группы
     * @param id id группы
     */
    void deleteStudentGroup(long id) throws RepositoryException;

    /**
     * получение группы по id
     * @param id id группы
     * @return группа
     */
    Group getStudentGroupById(long id) throws RepositoryException;

    /**
     * получение всех групп
     * @return список всех групп
     */
    List<Group> getStudentGroups() throws RepositoryException;
}
