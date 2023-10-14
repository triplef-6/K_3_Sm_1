package ru_omsu_fctk_simpleserver.repositories;

import ru_omsu_fctk_simpleserver.essence.Lesson;
import ru_omsu_fctk_simpleserver.essence.VisitingLesson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * заглушка
 */
public class RepositoryLesson implements IRepositoryLesson {
    private DataBase base;

    @Override
    public long addLesson(Lesson lesson) {
        System.out.println("Добавлено(типа)");
        return 6;
    }

    @Override
    public void editLesson(Lesson lesson) {
        System.out.println("Изменино(типа)");
    }

    @Override
    public void deleteLesson(long id) {
        System.out.println("Удалено(типа)");
    }

    @Override
    public VisitingLesson GetLessonById(long id) {
        return base.getVisitingLessonMap().get(id);
    }

    @Override
    public List<Lesson> getLessonsByGroup(long idGroup, LocalDate startDate, LocalDate endDate) {
        List<Lesson> lessons = new ArrayList<>();
        for (Lesson lesson : base.getLessonMap().values()) {
            if (lesson.getGroupId().equals(idGroup) && lesson.getData().isAfter(endDate) && lesson.getData().isBefore(startDate)) {
                lessons.add(lesson);
            }
        }
        return lessons;
    }

    @Override
    public List<Lesson> getLessonsByTeacher(long teacherId, LocalDate startDate, LocalDate endDate) {
        List<Lesson> lessons = new ArrayList<>();
        for (Lesson lesson : base.getLessonMap().values()) {
            if (lesson.getTeacherId().equals(teacherId) && lesson.getData().isAfter(endDate) && lesson.getData().isBefore(startDate)) {
                lessons.add(lesson);
            }
        }
        return lessons;
    }
}
