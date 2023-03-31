package repository;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentRepo {
    static List<Student> getAll(){
        List<Student> students = new ArrayList<>();
        return students;
    };

    static Student getByID(int stt){
        Student student = null ;
        return student;

    }
}
