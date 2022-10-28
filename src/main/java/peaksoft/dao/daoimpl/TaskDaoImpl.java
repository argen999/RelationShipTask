package peaksoft.dao.daoimpl;

import jakarta.persistence.EntityManager;
import peaksoft.dao.TaskDao;
import peaksoft.entity.Lesson;
import peaksoft.entity.Task;
import peaksoft.util.Util;

import java.util.List;

public class TaskDaoImpl implements TaskDao {

    @Override
    public void saveTask(Task task) {
        EntityManager entityManager = Util.getConnection();
        entityManager.getTransaction().begin();
        entityManager.persist(new Task(task.getName(),
                task.getDeadLina(), task.getTask(), task.getLesson().getId()));
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void updateTask(Long id, Task task) {
        EntityManager entityManager = Util.getConnection();
        entityManager.getTransaction().begin();
        Task task1 = entityManager.find(Task.class, id);
        task1.setName(task.getName());
        task1.setDeadLina(task.getDeadLina());
        task1.setTask(task.getTask());
        entityManager.refresh(task1);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<Task> getAllTaskByLessonId(Long lesson_id) {
        EntityManager entityManager = Util.getConnection();
        entityManager.getTransaction().begin();
        Lesson lesson = entityManager.find(Lesson.class, lesson_id);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Get all tasks successfully!");
        return lesson.getTasks();
    }

    @Override
    public void deleteTaskById(Long id) {
        EntityManager entityManager = Util.getConnection();
        entityManager.getTransaction().begin();
        Task task = entityManager.find(Task.class, id);
        entityManager.remove(task);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
