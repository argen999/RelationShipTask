package peaksoft;

import peaksoft.entity.Course;
import peaksoft.entity.Instructor;
import peaksoft.entity.Lesson;
import peaksoft.entity.Task;
import peaksoft.service.serviceimpl.CourseServiceImpl;
import peaksoft.service.serviceimpl.InstructorServiceImpl;
import peaksoft.service.serviceimpl.LessonServiceImpl;
import peaksoft.service.serviceimpl.TaskServiceImpl;
import peaksoft.util.Util;

import java.time.LocalDate;

public class App {
    public static void main( String[] args ) {
        CourseServiceImpl courseService = new CourseServiceImpl();
        InstructorServiceImpl instructorService = new InstructorServiceImpl();
        LessonServiceImpl lessonService = new LessonServiceImpl();
        TaskServiceImpl taskService = new TaskServiceImpl();

        Course course = new Course("Peaksoft", 9, LocalDate.of(2020, 1, 31),
        "https://webcache.googleusercontent.com/search?q=cache:fh0NFm2ejIkJ:https://peaksoft.house/&cd=1&hl=ru&ct=clnk&gl=kg",
        "PeakSoft House - бул PeakSoft IT компаниясынын онлайн жана офлайн окутуу курстары. " +
        "Биз талап кылынган Back-end (Java) жана Front-end (JavaScript), " +
        "IT адистерин online - offline даярдайбыз. Нолдон баштап биринчи жумуш күнүнө чейин.");

        Instructor instructor = new Instructor("Mukhamed",
                "Alanov", "alanovMukhamed@gmail.com", 555_55_65_75);

        Lesson lesson = new Lesson("Java",
                "https://www.youtube.com/watch?v=fYwViar9eMY");

        Task task = new Task("Array", "three day", "project relation ship");



//        courseService.saveCourse(course);

//        instructorService.saveInstructor(instructor);

//        instructorService.assignInstructorToCourse(1L, 1L);


//        lessonService.saveLesson(lesson, 1L);
//        taskService.saveTask(task);


    }
}
