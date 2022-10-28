package peaksoft.dao;

import peaksoft.entity.Lesson;

import java.util.List;

public interface LessonDao {
    void saveLesson(Lesson lesson, Long course_id);
    void updateLesson(Long id, Lesson lesson);
    Lesson getLessonById(Long id);
    List<Lesson> getLessonsByCourseId(Long course_id);
}
