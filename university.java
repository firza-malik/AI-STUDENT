import java.util.ArrayList;
import java.util.Scanner;

class Students {
    public int roll_number;
    public String name;

    Students(int roll_number, String name) {
        this.roll_number = roll_number;
        this.name = name;
    }

    public int getRollNumber() {
        return roll_number;
    }

    public String getName() {
        return name;
    }
}

public class university {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        Students student;

        boolean conti = false;
        do {
            System.out.println("University Management System");
            System.out.println("1. New Student");
            System.out.println("2. Search Student");
            System.out.println("3. All Students");
            Scanner scan = new Scanner(System.in);
            int user_choice = scan.nextInt();
            scan.nextLine();  
            if (user_choice == 1) {
                System.out.println("Create New Student");
                System.out.println("Enter name for new student: ");
                String name = scan.nextLine();

                System.out.println("Enter roll number for new student: ");
                int roll_number = scan.nextInt();

                student = new Students(roll_number, name);
                students.add(student);

                System.out.println("Student created successfully!");
                System.out.println("Student name is: " + student.getName());

            } else if (user_choice == 2) {
                System.out.println("Search Student");
                System.out.println("Enter roll number for searching student: ");
                int rollNo = scan.nextInt();

                for (Students stu : students) {
                    if (stu.getRollNumber() == rollNo) {
                        System.out.println("Student name: " + stu.getName());
                        System.out.println("student roll number:"+stu.getRollNumber());
                        break;
                    }
                }
                System.out.println("student is not found");


            } else if (user_choice == 3) {
                System.out.println("All Students:");
                for (Students stu : students) {
                    System.out.println("Student Name: " + stu.getName());
                    System.out.println("Student Roll Number: " + stu.getRollNumber());
                }
            } else {
                System.out.println("Invalid Option");
            }
            System.out.println("Do you want to continue? [y/n]: ");
            char user_input = scan.next().charAt(0);
           
            if (user_input == 'y') {
              conti = true;
            } else {
              conti = false;
            }
            scan.close();     
      
        } while (conti);
       
    }
}
