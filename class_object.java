class pen
{
    String color ;
    String type;


    public void write()
    {
        System.out.println("Sumit Panchal");
    }
    public void sumit()
    {
        System.out.println(this.color);
    }

}

class Student
{
    String name ;
    int age ;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() // non parameter constructor
    {
        System.out.println("constructor called");
    }

    // Student(String name , int age) // non parameterized constructor
    // {
    //     this.name = name ;
    //     this.age = age ;
    // }

    Student(Student s2) // copy constructor
    {
        this.name = s2.name;
        this.age = s2.age ; 
    }

}

public class class_object
{
    public static void main(String[] args) {
        // pen p1 = new pen();  // object creation
        // pen p2 = new pen();  // object creation
        // p1.color = "blue"; 
        // p1.type = "gel";
        // p2.color = "red";
        // p2.type = "ballpen";
        // // p1.sumit();
        // p1.sumit();
        // p2.sumit();


        Student s1 = new Student(); // constructor 
        Student s2 = new Student(s1); // constructor 

        s1.age = 18 ;
        s1.name = "Sumit";
        s2.age = 52 ;

        s1.printInfo();
        
    }
}