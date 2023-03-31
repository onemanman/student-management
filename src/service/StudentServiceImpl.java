package service;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {

    //Showing list of all student
    @Override
    public void showStudentlist() {
        System.out.println("List of all student :");
        List<Student> studentList = new ArrayList<Student>();
        StudentRepositoryImpl studentService = new StudentRepositoryImpl();
        studentService.getAll().forEach(student -> System.out.println(student.toString()));
    }

    //Showing information of a student by id
    @Override
    public void showStudentById(int stt) {
        System.out.println("The information of student have id is " + stt + ":");
        StudentRepositoryImpl studentService = new StudentRepositoryImpl();
        System.out.println(studentService.getByID(stt).toString());
    }
}




