package StudentAvargeMark;

public class Calculate {

    public static void main(String[] args) {
       
        Student[] students = new Student[5];
        
        
        students[0] = new Student("abc", 2, new float[]{83, 45, 56, 67});
        students[1] = new Student("def", 2, new float[]{93, 95, 66, 57});
        students[2] = new Student("joy", 2, new float[]{93, 85, 66, 87});
        students[3] = new Student("elsa", 2, new float[]{63, 85, 86, 77});
        students[4] = new Student("ddj", 2, new float[]{56, 49, 78, 97});
        
        for (Student student : students) {
            student.displayMarks();
            student.checkPassOrFail(42.0f);  
            System.out.println("-------------------------");
        }
    }
}
