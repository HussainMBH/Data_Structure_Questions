package Union_Of_Two_Sorted_Array;

import java.util.*;

public class Union_of_Two_Sorted_Array_Using_Set {
   static int a[] = {1,2,2,3,4,5,6,6,7,8,9,10};
    static int b[] = {2,3,4,4,5,11,12};
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> s = new ArrayList<Integer>();

        for(int i=0; i<a.length; i++) {
            set.add(a[i]);
        }
        for (int i=0; i<b.length; i++){
            set.add(b[i]);
        }

        for (int it : set){
            s.add(it);
        }
        System.out.println(s);

    }


}
