package Find_Missing_Number_Array;
import java.util.*;
public class Find_Missing_Number_Array_BF {
    public static int missingNumber(int []a, int l){
        //Outer loop that runs from 1 to l, It's Continues number
        for(int i=1; i<= l; i++){
            //flag variable to check
            //if an element exists
            int flag = 0;

            //search the element using linear search in array
            for(int j=0; j<l-1; j++){
                if(a[j] == i){
                    //i is present in the array
                    flag = 1;
                    break;
                }
            }
            //check if the element is missing
            //i.e flag ==0;
            if(flag ==0){
                return i;
            }
        }
        //The following line will never execute
        //It is just to avoid warnings
        return -1;
    }
    public static void main(String args[]) {
        int l = 5;
        int a[] = {1, 2, 3, 5};

        int ans = missingNumber(a, l);
        System.out.println("The missing number is: " + ans);
    }
}
