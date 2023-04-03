import service.StudentServiceImpl;
import service.StudentService;
import java.util.Scanner;

public class StudentManagementApplication {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //Creating menu
            System.out.println("Choose one of the options following: ");
            System.out.println("1. Show list of all student.");
            System.out.println("2. Find student by ID.");
            System.out.println("3. Student serializer.");
            System.out.println("4. Student deserializer.");
            System.out.println("Let choose: ");

            //Scaning and processing input
            byte order = scanner.nextByte();
            if (order == 1) {
                studentService.showStudentlist();
            } else if (order == 2) {
                System.out.println("Enter the stt of student");
                int stt = scanner.nextInt();
                studentService.showStudentById(stt);
            } else if (order == 3) {
                studentService.studentSerializer();
            } else if (order == 4) {
                studentService.studentDeserializer();
            }
            System.out.println("------------------*-------------------");
        }
    }
}


