package ru_omsu_fctk_simpleserver.response.lesson;

import java.time.LocalDate;

public class GetLessonsByGroupResponse {
    private String groupName;
    private String teacherName;
    private String teacherSurname;
    private String teacherPatronymic;
    private LocalDate data;
    private Integer time;

    public GetLessonsByGroupResponse(String groupName, String teacherName, String teacherSurname, String teacherPatronymic,
                                     LocalDate data, Integer time) {
        this.groupName = groupName;
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.teacherPatronymic = teacherPatronymic;
        this.data = data;
        this.time = time;
    }

    public String getGroupName() {
        return groupName;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTeacherPatronymic() {
        return teacherPatronymic;
    }

    public void setTeacherPatronymic(String teacherPatronymic) {
        this.teacherPatronymic = teacherPatronymic;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
