package repository;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class StudentRepositoryImpl implements StudentRepository {
    private static List<Student> mockData(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Long", 13, "Male", 8.1, 8.2, 8.3));
        students.add(new Student(2, "Hoang", 15, "Male", 8.5, 8.6, 8.7));
        students.add(new Student(3, "Linh", 14, "Female", 8.4, 9.0, 9.5));
        students.add(new Student(4, "Ngoc", 14, "Female", 8.7, 9.0, 8.8));
        return students;
    }
    @Override
    public List<Student> getAll(){
            return mockData();
        }
    @Override
    public Student getByID(int stt){
            return mockData().get(stt);
        }

    @Override
    public void serialize(List<Student> objs, String fileName) throws IOException {
        FileOutputStream output = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(output);
        out.writeObject(objs);
        out.close();
        output.close();
    }

    @Override
    public List<Student> deserialize(String fileName) throws IOException, ClassNotFoundException {
        List<Student> students;
        FileInputStream input = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(input);
        students = (List<Student>) in.readObject();
        in.close();
        input.close();
        return students;
    }

}




