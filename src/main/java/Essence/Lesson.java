package Essence;

import java.time.LocalDate;
import java.util.Objects;

public class Lesson {
    private Long id;
    private Long disciplineId;
    private Long groupId;
    private Long teacherId;
    private LocalDate data;
    private Integer time;

    public Lesson() {}

    public Lesson(Long id, Long disciplineId, Long groupId, Long teacherId, LocalDate data, Integer time) {
        this.id = id;
        this.disciplineId = disciplineId;
        this.teacherId = teacherId;
        this.time = time;
        this.data = data;
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

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Long disciplineId) {
        this.disciplineId = disciplineId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Objects.equals(id, lesson.id) && Objects.equals(disciplineId, lesson.disciplineId) && Objects.equals(groupId, lesson.groupId) && Objects.equals(teacherId, lesson.teacherId) && Objects.equals(data, lesson.data) && Objects.equals(time, lesson.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, disciplineId, groupId, teacherId, data, time);
    }
}
