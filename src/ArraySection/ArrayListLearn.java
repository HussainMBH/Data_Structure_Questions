package ArraySection;

import java.util.ArrayList;

public class ArrayListLearn {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Mohamed");
        arr.add("Bahir");
        arr.add("Hussain");
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.contains("Bahir"));

        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        ar.add(2,80); //add element
        ar.add("Mohamed");
        ar.add("Bahir");
        ar.add("Hussain");

        ar.add(arr); // add another array into one array


        System.out.println(ar);
        System.out.println(ar.add(60));
        System.out.println(ar);
        System.out.println(ar.remove(1));
        System.out.println(ar);




    }
}
