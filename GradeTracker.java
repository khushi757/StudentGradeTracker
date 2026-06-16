import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== STUDENT GRADE TRACKER =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    students.add(new Student(name, marks));

                    System.out.println("Student Added!");

                    break;

                case 2:

                    for(Student s : students){

                        System.out.println(
        "Name: " + s.getName()
        + " | Marks: " + s.getMarks()
        + " | Grade: " + s.getGrade());

                    }

                    break;
                case 3:

                    System.out.print("Enter Student Name: ");
    String searchName = sc.nextLine();

    boolean found = false;

    for(Student s : students){

        if(s.getName().equalsIgnoreCase(searchName)){

            System.out.println(
                    "Name: " + s.getName()
                    + " | Marks: " + s.getMarks()
                    + " | Grade: " + s.getGrade());

            found = true;
        }
    }

    if(!found){
        System.out.println("Student Not Found!");
    }

    break;

                case 4:

                    System.out.println("Thank You");

                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while(choice != 4);

        sc.close();
    }
}