package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.*;

import java.util.Map;

/**
 * заглушка для работы репозиториев
 */
public class DataBase {
    private Map<Long, Student> studentMap;
    private Map<Long, Teacher> teacherMap;
    private Map<Long, Group> groupMap;
    private Map<Long, Subject> subjectMap;
    private Map<Long, Lesson> lessonMap;
    private Map<Long, VisitingLesson> visitingLessonMap; // id занятия

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

    public Map<Long, Lesson> getLessonMap() {
        return lessonMap;
    }

    public Map<Long, VisitingLesson> getVisitingLessonMap() {
        return visitingLessonMap;
    }
}
