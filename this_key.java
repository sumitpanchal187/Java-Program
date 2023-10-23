/*1) this: to refer current class instance variable */
// class Student
// {
//     int roll ;
//     String name;

//     Student(int roll , String name)
//     {
//         this.roll = roll;
//         this.name = name;
//     }

//     void display()
//     {
//         System.out.println(roll+" "+name);
//     }
// }
// /**
//  * this_key
//  */
// public class this_key {

//     public static void main(String[] args) {
//         Student x = new Student(10,"sumit");
//         x.display();
//     }
// }

/*2) this: to invoke current class method */

// class Student
// {
//     void m()
//     {
//         System.out.println("M");
//     }
//     void n()
//     {
//         System.out.println("N");
//         this.m();
//     }
// }
// /**
//  * this_key
//  */
// public class this_key {

//     public static void main(String[] args) {
//         Student x = new Student();
//         x.n();
//     }
// }

/* this() : to invoke current class constructor */

// class A
// {  
//     A()
//     {
//         System.out.println("hello a");
//     }  
//     A(int x) // constructor overloading
//     {  
//         this();  
//         System.out.println(x);  
//     }  
//     void display()
//     {
//         System.out.println("sumit");
//     }
// }  
// class this_key
// {  
//     public static void main(String args[])
//     {  
//         A a=new A(10); 
//         a.display();

//     }
// }  

/* this: to pass as an argument in the method */
// class sumit
// {
//     void sp(sumit s)
//     {
//         System.out.println("Sumit Panchal");
//     }
//     void p()
//     {
//         sp(this);
//     }
// }

// public class this_key {

//     public static void main(String[] args) {
//         sumit foo = new sumit();
//         foo.p();
//     }
// }

/* 5) this: to pass as argument in the constructor call */
// class A
// {
//     sumit obj ;
//     A(sumit obj)
//     {
//         this.obj=obj;
//     }
//     void display()
//     {
//         System.out.println("sumit");
//     }
// }
// class sumit
// {
//     int data = 187 ;
//     sumit()
//     {
//         A a = new A(this);
//         a.display();
//     }
// }

/* 6) this keyword can be used to return current class instance */


class A
{

    A s()
    {  
        return this;  
    }  
    void msg()
    {
        System.out.println("Hello java");
    }  
}  
class this_key{  
    public static void main(String args[]){  
    new A().s().msg();  
    }  
}