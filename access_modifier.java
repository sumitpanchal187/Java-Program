// public 
// private 
// default
// protected 


// geeters & setters
class Account
{
    public String name ;
    String sumit ;
    protected int age; 
    private String name1 ;

    // getters
    public String getPassword()
    {
        return this.name1; 
    }    
    // setters
    public void setPassword(String pass)
    {
        this.name1 = pass ;

    }
}
public class access_modifier {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.name = "sumit";
        // ac.name1 = "rahul";

        ac.setPassword("sumit@187");
        System.out.println(ac.getPassword());
        
    }
}
