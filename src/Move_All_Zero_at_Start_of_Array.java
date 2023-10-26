import java.util.Arrays;
import java.util.Scanner;

public class Move_All_Zero_at_Start_of_Array {
    public static void main(String[] args){
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter Digits Count: ");
        int digitscount = scn.nextInt(); //get how many elements
        System.out.println("Enter elements");
        int ar[] = new int[digitscount]; //get elements
        for(int i=0; i<digitscount; i++){ //store in array
            ar[i] = scn.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        int l = ar.length;
        int j=1;
        for(int i=l-1; i>=0; i--){
            if(ar[i]!= 0){
                ar[l-j] = ar[i];
                j++;
            }
        }
        for(int i=0; i<l-(j-1); i++){
            ar[i]=0;
        }
        System.out.println(Arrays.toString(ar));
    }
}
