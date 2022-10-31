package peaksoft.service;

import peaksoft.entity.Task;

import java.util.List;

public interface TaskService {
    void saveTask(Task task, Long lesson_id);
    void updateTask(Long id, Task task);
    List<Task> getAllTaskByLessonId(Long lesson_id);
    void deleteTaskById(Long lesson_id);
}
