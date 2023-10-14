package ru_omsu_fctk_simpleserver.validators.request.lesson;

import java.time.LocalDate;

/**
 * добавление занятия
 */
public class AddLessonRequest {
    private String groupId;
    private String teacherId;
    private String data;
    private String time;

    public AddLessonRequest(String groupId, String teacherId, String data, String time) {
        this.data = data;
        this.groupId = groupId;
        this.time = time;
        this.teacherId = teacherId;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getData() {
        return data;
    }

    public String getTime() {
        return time;
    }
}
