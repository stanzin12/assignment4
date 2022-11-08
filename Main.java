
import java.util.Vector;

class Student {
    String name;
    String Rollno;
    int marks;

    Student(String name, String Rollno, int marks) {
        this.name = name;
        this.Rollno = Rollno;
        this.marks = marks;
    }

}

public class q1 {
    public static void main(String[] args) {
        Vector v = new Vector(20);
        Student s1 = new Student("akshat", "113", 30);
        Student s2 = new Student("Nawang", "108", 30);
        Student s3 = new Student("s3", "1113", 30);
        v.addElement(s1);
        v.addElement(s2);
        v.addElement(s3);
        System.out.println(v.size());
        int i = 0;
        while (i < v.size()) {
            System.out.println(v.elementAt(i).toString());
            i = i + 1;
        }

    }
}