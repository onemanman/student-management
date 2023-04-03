package service;

import model.Student;

import java.io.IOException;
import java.util.List;

public interface StudentService {
    void showStudentlist();
    void showStudentById(int stt);
    void studentSerializer();
    void studentDeserializer();

}
