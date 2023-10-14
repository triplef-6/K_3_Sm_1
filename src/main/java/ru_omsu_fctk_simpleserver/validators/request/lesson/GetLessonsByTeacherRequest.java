package ru_omsu_fctk_simpleserver.validators.request.lesson;

import java.time.LocalDate;

/**
 * получение списка занятий за период для преподавателя (без информации о посещаемости)
 */
public class GetLessonsByTeacherRequest {
    private String teacherId;
    private String startDate;
    private String endDate;

    public GetLessonsByTeacherRequest(String groupId, String startDate, String endDate) {
        this.teacherId = groupId;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
