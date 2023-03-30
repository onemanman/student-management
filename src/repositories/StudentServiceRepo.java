package repositories;

import model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentServiceRepo {
    public List<Student> getAll(){
            List<Student> students = new ArrayList<>();

            // add student object to list
            students.add(new Student(0, "Long", 13, "Male", 8.1, 8.2, 8.3));
            students.add(new Student(1, "Hoang", 15, "Male", 8.5, 8.6, 8.7));
            students.add(new Student(2, "Linh", 14, "Female", 8.4, 9.0, 9.5));
            students.add(new Student(3, "Ngoc", 14, "Female", 8.7, 9.0, 8.8));
            return students;
        }
    public Student getByID(){

    }

    }


