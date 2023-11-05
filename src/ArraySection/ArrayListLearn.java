package ArraySection;

import java.util.ArrayList;

public class ArrayListLearn {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Mohamed");
        arr.add("Bahir");
        arr.add("Hussain");
        System.out.println(arr);
        //Size method
        System.out.println("Size Method "+arr.size());
        System.out.println("Contains Method "+arr.contains("Bahir")); //Check that value is in there or not

        ArrayList ar = new ArrayList();
        ar.add(10); // it's not int it's a Integer
        ar.add(20);
        ar.add(30);
        ar.add(40);

        ar.add(2,80); //add element

        ar.add("Bahir");
        ar.add("Hussain");
        ArrayList a = new ArrayList();

        System.out.println("a array is empty? "+a.isEmpty());
        a.add(100);
        a.add(200);
        a.add("Zain");
        a.add(5.2f); // it's not a premitive data type it's a objective

        ar.add(arr); // add another array into one array
        a.addAll(ar); //add all first a of arrays will add
        //a.add(0,ar);
        //ar.clear(); //Clear all arrays


        System.out.println(a);
        System.out.println("a array is empty? "+a.isEmpty());
        System.out.println(ar.get(1)); //check in that index what value have in there
        ar.add(1,150);
        System.out.println(ar.get(1));

        System.out.println(ar);
        //System.out.println(ar.add(60));
        System.out.println(ar.remove(1));
        System.out.println(ar);
        System.out.println("Add all and add main array in first "+a);
        System.out.println(ar.indexOf(30)); // checking value in which index

    }
}
