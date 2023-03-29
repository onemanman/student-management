import model.Student;
public class Main {
    public static void main(String[] args) {
        //Create objects
        Student student1 = new Student(1,"Long",13,"Male");
        Student student2 = new Student(2,"Hoang",15,"Male",8.5);
        Student student3 = new Student(3,"Linh",14,"Female",8.4,9.0);
        Student student4 = new Student(4,"Ngoc",14,"Female",8.7,9.0,8.8);

        //Testing constructor
        System.out.println("Tuoi cua Long la : " + student1.age);
        System.out.println("Diem toan cua Hoang la " + student2.math);
        System.out.println("Diem sinh cua Linh la " + student3.biology);
        System.out.println("Diem ngu van cua Ngoc la " + student4.literature);

        //Testing get and set methods
        student1.setBiology(9.0);
        Double LongBioMarks = student1.getBiology();
        System.out.println("Diem sinh cua Long la : " + LongBioMarks);
        student2.setLiterature(8.5);
        Double HoangliteraMark = student2.getLiterature();
        System.out.println("Diem van cua Hoang la :"+HoangliteraMark);
    }
}