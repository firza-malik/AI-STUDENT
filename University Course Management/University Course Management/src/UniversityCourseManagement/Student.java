 package UniversityCourseManagement;

import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    ArrayList<Course> enrolledCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
   
    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
        } 
    }

    public int calculateTotalCredits() {
        int totalCredits = 0;
        for (Course course : enrolledCourses) {
            totalCredits += course.getCredits();
        }
        return totalCredits;
    }

    public String generateReport() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            return "SuBject Name:"+course.getName()+"\n"+"instructor:"+course.getInstructor()+"\n"+"credits:"+course.getCredits();
        }
        return "Total Credits: " + calculateTotalCredits();
    }
}
