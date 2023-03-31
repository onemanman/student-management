package service;
import repository.StudentRepositoryImpl;
import repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
    public StudentRepository studentService = new StudentRepositoryImpl();

    //Showing list of all student
    @Override
    public void showStudentlist() {
        System.out.println("List of all student :");
        studentService.getAll().forEach(student -> System.out.println(student.toString()));
    }

    //Showing information of a student by id
    @Override
    public void showStudentById(int stt) {
        System.out.println("The information of student have id is " + stt + ":");
        System.out.println(studentService.getByID(stt).toString());
    }
}




