package ArraySection;

import java.util.Hashtable;

public class Hash_Function {
   public static void main(String[] args){
       //Create HashTable to store String value
       Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
       //Input Values
       hm.put(1, "Mohamed");
       hm.put(2, "Bahir");
       hm.put(3, "Hussain");

       System.out.println(hm);
   }
}
