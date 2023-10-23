class Student
{
    int roll ;
    String name ;
    static String clg = "ITM";

    Student(int r , String n)
    {
        roll = r ;
        name = n;
    }
    static void change()
    {
        clg = "parul";
    }
    void display()
    {
        System.out.println(roll + " " + name +" "+ clg);
    }

    static{
        System.out.println("static block");
    }
}
public class staticc {
    public static void main(String[] args) {
        Student.change();
        Student s = new Student(10,"sumit");
        s.display();
        
    }
}
