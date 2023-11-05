/*
LinkedHashSet is a insertion order maintain
* */
package Set_Interface;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class linkedhasset {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
        hs.add(5);
        hs.add(10);
        hs.add(3);
        hs.add(4);
        hs.add(7);
        hs.add(8);
        System.out.println(hs);
        System.out.println("Can add number 10 duplicate element? " + hs.add(10));//checking for can add duplicate element

        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(30);
        ll.add(20);
        ll.add(40);
        ll.add(50);
        ll.add(50);

        System.out.println();
        System.out.println("Befor LinkedHashSet " + ll);
        LinkedHashSet lhs = new LinkedHashSet(ll); // adding linkedlist in linkedhashset for removing duplicate
        System.out.println("After LinkedHashSet " + lhs);

    }
}
