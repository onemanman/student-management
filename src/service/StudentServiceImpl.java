package service;
import model.Student;
import repository.StudentRepositoryImpl;
import repository.StudentRepository;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

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

    @Override
    public void studentSerializer() {
       try {
           studentService.serialize(studentService.getAll(), "student.ser");
           System.out.println("Data is serialized in 'student.ser'");
       } catch (IOException ignored){
           System.out.println(ignored.getMessage());
       }
    }

    @Override
    public void studentDeserializer() {
       try {
           System.out.println("Data is deserialized from file 'student.ser': ");
           List<Student> studentsDeserializedList = studentService.deserialize("student.ser");
           studentsDeserializedList.forEach(student -> System.out.println(student.toString()));
       }catch (IOException | ClassNotFoundException e){
           System.out.println(e.getMessage());
       }

    }


}




