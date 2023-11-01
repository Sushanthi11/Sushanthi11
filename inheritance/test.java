package inheritance;
import java.util.*;
public class test {
    public static void main(String[] args) {
        EdSystem c=new EdSystem();
        c.studentName="sdfgh";

        staff d=new staff();
        d.teacherName="preethi";

        Batch e=new Batch();
        e.courseName="java";
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the StudentID: ");
        int x=scn.nextInt();
        System.out.println("enter the TeacherID: ");
        int y=scn.nextInt();
        System.out.println("enter the CourseID: ");
        int z=scn.nextInt();

        d.teacher();
        c.student();
        e.course();

    }
}
