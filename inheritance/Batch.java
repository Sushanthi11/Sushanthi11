package inheritance;

public class Batch extends EdSystem{
    public int courseID;
    public String courseName;
    public int maxStudents;
    public void course(){
        System.out.println("CourseID: "+courseID);
        System.out.println("CourseName: "+courseName);
        System.out.println("MaxStudents: "+maxStudents);
    }
}
