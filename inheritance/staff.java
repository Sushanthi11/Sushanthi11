package inheritance;

public class staff extends EdSystem{
    public int teacherID;
    public String teacherName;
    public int subject;
    public void teacher(){

        System.out.println("Teacher ID: "+teacherID);
        System.out.println("Teacher Name: "+teacherName);
        System.out.println("Subject: "+subject);
    }
}
