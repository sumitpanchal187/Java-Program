// class operation
// {
//     int data = 50 ;
//     void change(operation op)
//     {
//         op.data += 100;

//     }
// }
// public class callbymethod {

//     public static void main(String[] args) {
//         operation op = new operation();
//         System.out.println(op.data);
//         op.change(op);
//         System.out.println(op.data);
//     }
// }


/*class A{
    int a = 5 ;
    int b = 7 ;
    int sum(int c , int d){
        int e = c+d;
        return e;

    }
    void add(int f , int g){
        System.out.println(f+g);
    }
}
public class callbymethod {

    public static void main(String[] args) {
        A op = new A();
        System.out.println(op.sum(15,20));
        op.add(op.a,op.b);
    }
}

*/

/*
class operation {
    int d = 100;
    void change(int d)
    {
        this.d=d;
        d+=100;
        System.out.println(d);
    }
}
public class callbymethod {

    public static void main(String[] args) {
        operation op = new operation();
        System.out.println(op.d);
        op.change(500);
    }
}

*/