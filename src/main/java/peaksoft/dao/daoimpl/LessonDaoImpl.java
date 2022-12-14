package peaksoft.dao.daoimpl;

import jakarta.persistence.EntityManager;
import peaksoft.dao.LessonDao;
import peaksoft.entity.Course;
import peaksoft.entity.Lesson;
import peaksoft.util.Util;

import java.util.List;

public class LessonDaoImpl implements LessonDao {
    @Override
    public void saveLesson(Lesson lesson, Long course_id) {
        EntityManager entityManager = Util.getConnection();
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, course_id);
        course.getLessons().add(lesson);
        lesson.setCourse(course);
        entityManager.persist(course);
        entityManager.persist(lesson);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void updateLesson(Long id, Lesson lesson) {
        EntityManager entityManager = Util.getConnection();
        entityManager.getTransaction().begin();
        Lesson lesson1 = entityManager.find(Lesson.class, id);
        lesson1.setName(lesson.getName());
        lesson1.setVideoLink(lesson.getVideoLink());
        entityManager.refresh(lesson1);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Lesson getLessonById(Long id) {
        EntityManager entityManager = Util.getConnection();
        entityManager.getTransaction().begin();
        Lesson lesson = entityManager.find(Lesson.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Get lesson by id successfully!");
        return lesson;
    }

    @Override
    public List<Lesson> getLessonsByCourseId(Long course_id) {
        EntityManager entityManager = Util.getConnection();
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, course_id);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Get all lessons by course id successfully!");
        return course.getLessons();
    }

}
