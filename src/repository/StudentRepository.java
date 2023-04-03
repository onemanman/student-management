package repository;

import model.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface StudentRepository {
    List<Student> getAll();
    Student getByID(int stt);
    void serialize(List<Student> objs, String fileName) throws IOException;
    List<Student> deserialize(String fileName) throws IOException,ClassNotFoundException;
}
