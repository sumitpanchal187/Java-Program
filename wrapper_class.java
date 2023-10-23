// public class wrapper_class {

//     public static void main(String[] args) {
//         int a = 20 ;
//         Integer i = Integer.valueOf(a);
//         int j  =a;
//         System.out.println(a+" "+i+" "+j);
//     }
// }

/**
 * wrapper_class
 */
// public class wrapper_class {
    
//     public static void main(String[] args) {
//         Integer i = new Integer(5);
//         int j = i.intValue();
//         int k = i;
//         System.out.println(k+" "+i+" "+j);
        
//     }
// }

/*
public class wrapper_class{  
public static void main(String args[]){  
byte b=10;  
short s=20;  
int i=30;  
long l=40;  
float f=50.0F;  
double d=60.0D;  
char c='a';  
boolean b2=true;  
  
//Autoboxing: Converting primitives into objects  
Byte byteobj=b;  
Short shortobj=s;  
Integer intobj=i;  
Long longobj=l;  
Float floatobj=f;  
Double doubleobj=d;  
Character charobj=c;  
Boolean boolobj=b2;  
  
  
//Unboxing: Converting Objects to Primitives  
byte bytevalue=byteobj;  
short shortvalue=shortobj;  
int intvalue=intobj;  
long longvalue=longobj;  
float floatvalue=floatobj;  
double doublevalue=doubleobj;  
char charvalue=charobj;  
boolean boolvalue=boolobj;  

System.out.println("---Printing primitive values---");  
System.out.println("byte value: "+bytevalue);  
System.out.println("short value: "+shortvalue);  
System.out.println("int value: "+intvalue);  
System.out.println("long value: "+longvalue);  
System.out.println("float value: "+floatvalue);  
System.out.println("double value: "+doublevalue);  
System.out.println("char value: "+charvalue);  
System.out.println("boolean value: "+boolvalue);  
}}


*/

//Creating the custom wrapper class  
class Javatpoint{  
    private int i;  
    Javatpoint(int i){  
    this.i=i;  
    }  
    public int getValue(){  
    return i;  
    }  
    public void setValue(int i){  
    this.i=i;  
    }  
    // @Override  
    public String toString() {  
      return Integer.toString(i);  
    }  
    }  
    //Testing the custom wrapper class  
    public class wrapper_class{  
    public static void main(String[] args){  
    Javatpoint j=new Javatpoint(10);  
    System.out.println(j);
    j.setValue(50);  
    System.out.println(j.getValue());
    System.out.println(j.toString());
    
    }}  