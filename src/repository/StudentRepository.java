package repository;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentRepository {
    List<Student> getAll();
    Student getByID(int stt);
}
