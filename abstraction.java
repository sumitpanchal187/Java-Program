interface Animal
{
    void walks();

}
interface Herbivore
{
    
}
class Horse implements Animal , Herbivore
{
    public void walks()
    {
        System.out.println("horse can walk on 4 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse hq = new Horse();
        hq.walks();
    }
}
