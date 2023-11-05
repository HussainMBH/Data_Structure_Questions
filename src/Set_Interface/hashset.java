/*
it's a object store, we can't add duplicate element
Insertion is not order maintain
*/
package Set_Interface;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add(5);
        hs.add(10);
        hs.add(3);
        hs.add(4);
        hs.add(7);
        hs.add(8);
        System.out.println(hs);
        System.out.println("Can add number 10 duplicate element? "+hs.add(10));//checking for can add duplicate element
    }
}
