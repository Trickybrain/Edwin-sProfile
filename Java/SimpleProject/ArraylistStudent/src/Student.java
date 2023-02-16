/* Student.java

Author- Anita Rathi

 */

public class Student
{
    private String Name;
    private int Sno;

    public Student()
    {
        Name="No Name";
        Sno=0;
    }

    public Student(Student S)
    {
        Name=S.Name;
        Sno=S.Sno;
    }

    public void set(Student S)
    {
        S.Name="xyz";
        S.Sno=10;

    }

    public void set(String n, int no)
    {
        Name=n;
        Sno=no;

    }

    public String toString()
    {
        return("Name=" + Name + "  Sno=" + Sno);
    }

}
