package UniversityCourseManagement;

import java.util.ArrayList;

public class Course {
    private String name;
    private String instructor;
    private int credits;
    ArrayList<Student> enrolledStudents;

    public Course(String name, String instructor, int credits) {
        this.name = name;
        this.instructor = instructor;
        this.credits = credits;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCredits() {
        return credits;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.getEnrolledCourses().add(this);
        }
    }
  

    public static void main(String[] args) {
        Course course1 = new Course("Math", "Sir Tariq", 1);
        Course course2 = new Course("Physics", "Sir Rana", 2);
        Course course3 = new Course("Programming Fundamentals", "Sir Owais", 3);

        Student student1 = new Student("Jawaria", 1);
        Student student2 = new Student("Bushra", 2);
        Student student3 = new Student("joti", 3);

        course1.addStudent(student1);
        course2.addStudent(student1);
        course2.addStudent(student2);
        course3.addStudent(student2);
        course3.addStudent(student3);

        System.err.println(student1.generateReport());
        System.out.println(student2.generateReport());
        System.out.println(student3.generateReport());
    }
}
