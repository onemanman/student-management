package service;

import model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    //Print object function
    public static void PrintObj(List<Student> lstudent,int index,int stt,String name,int age,String gender,double math,double biology,double literature){
        stt = lstudent.get(index).stt;
        name = lstudent.get(index).name;
        age = lstudent.get(index).age;
        gender = lstudent.get(index).gender;
        math = lstudent.get(index).math;
        biology = lstudent.get(index).biology;
        literature = lstudent.get(index).literature;
        System.out.println("Stt: "+stt + ", Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Math: " + math + ", Biology: " + biology + ", Literature: " + literature);
    }
    //Counting gender using StreamAPI
    public int genderCount(List<Student> lstudent,String gender){
        return (int) lstudent.stream().filter(student ->student.gender == gender ).count();

    }

    //Showing list of all student function
    @Override
    public void showStudentlist(List<Student> lstudent) {
        System.out.println("List of all student :");
        for (int i = 0; i < lstudent.size(); i++) {
              PrintObj(lstudent,i,lstudent.get(i).stt,lstudent.get(i).name,lstudent.get(i).age,lstudent.get(i).gender,lstudent.get(i).math,lstudent.get(i).biology,lstudent.get(i).literature);
        }

    }

    //Showing information of a student by id
    @Override
    public void showStudentbystt(List<Student> lstudent, int stt) {
        int count = 0;
        for (int i = 0; i < lstudent.size(); i++) {
            if (lstudent.get(i).stt == stt) {
                PrintObj(lstudent,i,lstudent.get(i).stt,lstudent.get(i).name,lstudent.get(i).age,lstudent.get(i).gender,lstudent.get(i).math,lstudent.get(i).biology,lstudent.get(i).literature);
                ++count;
                break;
            }
            }
        if (count == 0) {
            System.out.println("Student not found!");
        }
    }


}