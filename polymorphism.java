// poly --> many
// morphism --> form
// types --> function overloading , overriding

class Student
{
String name ;
int age ;


    public void printInfo(String name)
    {
        System.out.println(name);
    }
    public void printInfo(int age)
    {
        System.out.println(age);
    }
    public void printInfo(String name , int age)
    {
        System.out.println(name);
        System.out.println(age);
    }
}


public class polymorphism {
    
    public static void main(String[] args) {
        Student foo = new Student();
        // foo.name = "sumit";
        // foo.age = 20 ;

        foo.printInfo("sumit",18);
    }
}
