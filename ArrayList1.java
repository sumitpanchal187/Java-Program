// array list is the most important concept of collection frameworks

import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 
{
    public static void main(String[] args) 
    {
        ArrayList <Integer> list = new ArrayList <Integer>(); 

        // add element
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        // get elements
        int element = list.get(0);
        System.out.println(element);
        System.out.println(list.get(1));

        // add element in between
        list.add(1,5);
        System.out.println(list);

        // set element 
        list.set(0, 15);
        System.out.println(list);

        // delete element 
        list.remove(2);
        System.out.println(list);

        // size
        System.out.println(list.size());

        // loops 
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // sorting 
        Collections.sort(list);
        System.out.println(list);
    }
}
