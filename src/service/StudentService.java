package service;

import model.Student;

import java.util.List;

public interface StudentService {
    void showStudentlist(List<Student> lstudent);
    void showStudentbystt(List<Student> lstudent, int stt);
}
