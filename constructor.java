class sumit
{
    int roll,age;
    String name;
    sumit() // non parameterized constructor
    {
        System.out.println("SUMIT PANCHAL");
    }
    sumit(int r , String n) //parameterized constructor
    {
        roll =r ;
        name = n;
    }
    sumit(int r , String n,int a) //parameterized constructor // constructor overloading
    {
        roll =r ;
        age = a;
        name = n;
    }
    sumit(sumit s) // copy constructor
    {
        age = s.age;
        name = s.name;
        roll = s.roll ;
    }
    void display()
    {
        System.out.println(roll+" "+name+" "+age);
    }
}
/**
 * constructor
 */
public class constructor {

    public static void main(String[] args) {
        sumit sp = new sumit(18,"sumit");
        sumit sps = new sumit(18,"sumit",28);
        sumit ssp = new sumit(sps);
        sp.display();
        sps.display();
        ssp.display();
    }
}