// class Employee{  
//     int id;  
//     String name;  
//     int salary;  
//     Employee(int i, String n, int s) {  
//         id=i;  
//         name=n;  
//         salary=s;  
//     }  
//     void display(){System.out.println(id+" "+name+" "+salary);}  
// }  
// public class object {  
// public static void main(String[] args) {  
//     Employee e1=new Employee(101,"Sumit",150000);  
//     e1.display();  
// }  
// }  

/* DIFFRENT WAY TO CREATE OBJECT
 * by new keyword
 * newInstance() method
 * clone() method
 * deserializaion
 * factory method
 */

 /**
  * object
  */

  class sumit
  {
    void sp(int n)
    {
        System.out.println(n);
    }
  }
 public class object {
 
    public static void main(String[] args) {
        // new sumit();
        sumit x = new sumit();
        x.sp(5);
        
    }
 }

 /* types of method 
  * predefined method 
  user defined method
  
  */