package StudentAvargeMark;
public class Student {
    public String name;
    public int rollno;
    public float[] marks;
    public float totalmarks=700.0f;

    
    public Student(String name, int rollno, float[] marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    
    public float averageMarks() {
        float sum = 0;
        for (float mark : marks) {
            sum += mark;
        }
        return sum / totalmarks*100;
    }
    public void displayMarks() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        for (float mark : marks) {
            System.out.println("Marks: " + mark);
        }
        System.out.println("persantage: " + averageMarks());
    }
    public void checkPassOrFail(float passingMarks) {
        if (averageMarks() >= passingMarks) {
            System.out.println(name + " passed.");
        } else {
            System.out.println(name + " failed.");
        }
    }
}
