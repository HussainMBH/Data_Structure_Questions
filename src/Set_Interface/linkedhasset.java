/*
LinkedHashSet is a insertion order maintain
* */
package Set_Interface;

import java.util.LinkedHashSet;

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
    }
}
