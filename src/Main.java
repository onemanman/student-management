import model.Student;
import service.StudentServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create objects
        Student student1 = new Student(0, "Long", 13, "Male", 8.1, 8.2, 8.3);
        Student student2 = new Student(1, "Hoang", 15, "Male", 8.5, 8.6, 8.7);
        Student student3 = new Student(2, "Linh", 14, "Female", 8.4, 9.0, 9.5);
        Student student4 = new Student(3, "Ngoc", 14, "Female", 8.7, 9.0, 8.8);

        //Add object to a list
        List<Student> lstudent = new ArrayList<>();
        lstudent.add(student1);
        lstudent.add(student2);
        lstudent.add(student3);
        lstudent.add(student4);


        Scanner scanner = new Scanner(System.in);
        while (true) {

            //Creating menu
            System.out.println("Choose one of the options following: ");
            System.out.println("1.Show list of all student.");
            System.out.println("2.Find student by ID.");
            System.out.println("Let choose: ");

            //Scaning and processing input
            byte order = scanner.nextByte();
            if (order == 1) {
                StudentServiceImpl student = new StudentServiceImpl();
                student.showStudentlist(lstudent);
                System.out.println("Total male student is : " + student.genderCount(lstudent,"Male"));
                System.out.println("Total female student is : " + student.genderCount(lstudent,"Female"));

            } else if (order == 2) {
                System.out.println("Enter the stt of student");
                int stt = scanner.nextInt();
                StudentServiceImpl student = new StudentServiceImpl();
                student.showStudentbystt(lstudent, stt);
            }
            System.out.println("------------------*-------------------");
        }
    }
}


