package service;
import java.util.List;
import model.Student;
import



public class StudentServiceImpl implements StudentService {

    //Counting gender
    public int genderCount(List<Student> lstudent,String gender){
        return (int) lstudent.stream().filter(student ->student.gender == gender ).count();

    }

    //Showing list of all student
    @Override
    public void showStudentlist(List<Student> lstudent) {
        System.out.println("List of all student :");
        lstudent.stream().forEach(student -> System.out.println(student.toString()));
    }

    //Showing information of a student by id
    @Override
    public void showStudentbystt(List<Student> lstudent, int stt) {
        System.out.println("The information of student have stt is " + stt + ":");
        lstudent.stream().filter(id -> id == lstudent.get(stt)).forEach(student -> System.out.println(student.toString()));
            }
}




