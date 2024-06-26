/*Define a class named Student with member variables for name, roll number, and marks 
in three subjects. Write a constructor to initialize these variables and methods to display 
student details. */

public class Student {
    String name;
    int calculus ,oop,DlD, rollno;
    Student(int rollno,int oop,int DlD,int calculus,String name){
        this.DlD=DlD;
        this.calculus=calculus;
        this.oop=oop;
        this.rollno=rollno;
        this.name=name;
    }
    public void display(){
        System.out.println("Roll number:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Subject marks");
        System.out.println("calculus:"+calculus);
        System.out.println("DlD:"+DlD);
        System.out.println("oop:"+oop);

    }
    public static void main(String[] args) {
        Student Student1=new Student(36, 20, 19, 20, "sana");
        Student1.display();
        
    }

    
}