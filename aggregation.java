import javax.sql.rowset.spi.SyncResolver;

class sq
{
    int square(int n)
    {
        return n*n;
    }
}
class circle
{
    sq ssp;
    double pi = 3.14;
    double area(int rad)
    {
        ssp = new sq();
        int sq = ssp.square(rad);
        return pi*sq;
    }
}
public class aggregation {
    public static void main(String[] args) {
        
        
        circle foo = new circle();
        double lk = foo.area(5);
        
        System.out.println(lk);
    }
}