package Union_Of_Two_Sorted_Array;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Union_Of_Two_Sorted_Array_BF {
    static ArrayList<Integer> FindUnion(int ar1[], int ar2[], int n, int m) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            freq.put(ar1[i], freq.getOrDefault(ar1[i], 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            freq.put(ar2[i], freq.getOrDefault(ar2[i], 0) + 1);
        }
        for (int it : freq.keySet()) {
            Union.add(it);
        }
        return Union;
    }

    public static void main(String args[]) {
        int n = 10, m = 7;
        int ar1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ar2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = FindUnion(ar1, ar2, n, m);
        System.out.println("Union of ar1 and ar2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }
}
