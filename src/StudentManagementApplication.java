import service.StudentServiceImpl;
import java.util.Scanner;

public class StudentManagementApplication {
    public static void main(String[] args) {

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
                student.showStudentlist();


            } else if (order == 2) {
                System.out.println("Enter the stt of student");
                int stt = scanner.nextInt();

                StudentServiceImpl student = new StudentServiceImpl();
                student.showStudentById(stt);
            }
            System.out.println("------------------*-------------------");
        }
    }
}


