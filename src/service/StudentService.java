package service;

import model.Student;

import java.util.List;

public interface StudentService {
    void showStudentlist();
    void showStudentById(List<Student> lstudent, int stt);
}
