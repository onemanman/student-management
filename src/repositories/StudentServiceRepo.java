package repositories;

import model.Student;
import java.util.ArrayList;
import java.util.List;


public class StudentServiceRepo {
    public static List<Student> students = new ArrayList<>();

    public static void mockData(){
        students.add(new Student(0, "Long", 13, "Male", 8.1, 8.2, 8.3));
        students.add(new Student(1, "Hoang", 15, "Male", 8.5, 8.6, 8.7));
        students.add(new Student(2, "Linh", 14, "Female", 8.4, 9.0, 9.5));
        students.add(new Student(3, "Ngoc", 14, "Female", 8.7, 9.0, 8.8));
    }

    public static List<Student> getAll(){
            StudentServiceRepo.mockData();
            return students;
        }
    public static Student getByID(int stt){
            StudentServiceRepo.mockData();
            return students.get(stt);
            }

    }




