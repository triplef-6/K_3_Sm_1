package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.*;

import java.util.HashMap;
import java.util.Map;

/**
 * заглушка для работы репозиториев
 */
public class DataBase {
    private Map<Long, Student> studentMap;
    private long maxStudentId;
    private Map<Long, Audience> audienceMap;
    private long maxAudienceId;
    private Map<Long, Teacher> teacherMap;
    private Map<Long, Group> groupMap;
    private long maxGroupId;
    private Map<Long, Subject> subjectMap;
    private long maxSubjectId;
    private Map<Long, Lesson> lessonMap;
    private Map<Long, VisitingLesson> visitingLessonMap;

    public DataBase() {
        this.studentMap = new HashMap<>();
        this.maxStudentId = 1;

        this.groupMap = new HashMap<>();
        this.maxGroupId = 1;

        this.subjectMap = new HashMap<>();
        this.maxSubjectId = 1;
    }
    public long nextSubjectId() {
        long idRet = maxSubjectId;
        this.maxSubjectId++;
        return idRet;
    }
    public long nextStudentId() {
        long idRet = maxStudentId;
        this.maxStudentId++;
        return idRet;
    }

    public long nextGroupId() {
        long idRet = maxGroupId;
        this.maxGroupId++;
        return idRet;
    }
    public long nextAudienceId() {
        long idRet = maxAudienceId;
        this.maxAudienceId++;
        return idRet;
    }

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

    public Map<Long, Audience> getAudienceMap() {
        return audienceMap;
    }

    public Map<Long, VisitingLesson> getVisitingLessonMap() {
        return visitingLessonMap;
    }

}
