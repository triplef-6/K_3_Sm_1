package repositories;

import essence.Group;
import essence.Student;
import essence.Subject;
import essence.Teacher;

import java.util.Map;

/**
 * заглушка для работы репозиториев
 */
public class DataBase {
    private Map<Long, Student> studentMap;
    private Map<Long, Teacher> teacherMap;
    private Map<Long, Group> groupMap;
    private Map<Long, Subject> subjectMap;

    public Map<Long, Student> getStudentMap() {
        return studentMap;
    }

    public Map<Long, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public Map<Long, Group> getGroupMap() {
        return groupMap;
    }

    public Map<Long, Subject> getSubjectMap() {
        return subjectMap;
    }
}
