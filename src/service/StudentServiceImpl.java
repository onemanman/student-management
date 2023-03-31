package service;
import java.util.List;
import model.Student;
import repository.StudentRepoImpl;

public class StudentServiceImpl implements StudentService {

    //Counting gender
    public int genderCount(List<Student> lstudent,String gender){
        return (int) lstudent.stream().filter(student ->student.gender == gender ).count();

    }

    //Showing list of all student
    @Override
    public void showStudentlist() {
        System.out.println("List of all student :");
        StudentRepoImpl.getAll().forEach(student -> System.out.println(student.toString()));
    }

    //Showing information of a student by id
    @Override
    public void showStudentById(int stt) {
        System.out.println("The information of student have id is " + stt + ":");
        System.out.println(StudentRepoImpl.getByID(stt).toString());
    }
}




