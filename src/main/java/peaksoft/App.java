package peaksoft;


import peaksoft.dao.daoimpl.CourseDaoImpl;
import peaksoft.dao.daoimpl.InstructorDaoImpl;
import peaksoft.entity.Course;
import peaksoft.entity.Instructor;


import java.time.LocalDate;


public class App {
    public static void main( String[] args ) {
        CourseDaoImpl courseDao = new CourseDaoImpl();
        InstructorDaoImpl instructorDao = new InstructorDaoImpl();
//        courseDao.saveCourse(
//                new Course("Peaksoft",
//                9, LocalDate.now(), "ksldajf",
//                "kajdsf"));
//        instructorDao.saveInstructor(
//                new Instructor("Muha", "Allanov",
//                        "muha@gmail.com", 4095876));

//        instructorDao.assignInstructorToCourse(1L, 1L);
//        System.out.println(instructorDao.getInstructorsByCourseId(1L));






    }
}
