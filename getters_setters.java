class sumit
{
    int roll;
String name ;
public int getid() {
    return roll;
}
public void setroll(int roll)
{
    this.roll = roll;
}
public String getname() {
    return name;
}
public void setname(String name)
{
    this.name = name;
}
void display()
{
    System.out.println(roll);
    System.out.println(name);
}}
public class getters_setters {
    public static void main(String[] args) {
        // Object foo = new Object();
        sumit sp = new sumit();
        sp.setroll(15);
        sp.setname("sumit");
        System.out.println(sp.getid());
        sp.display();
        
        
    }
}
