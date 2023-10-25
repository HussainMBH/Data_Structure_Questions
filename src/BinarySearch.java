import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int ar[] = {1,2,3,4,5,6,7};
        int l = ar.length;
        int lb = 0;
        int ub = l-1;
        int flag = 0;
        Scanner scn = new Scanner(System.in);
        int key = scn.nextInt(); // take key input from user
        while(lb<=ub){ //binary search will run if that be sorted
            int mid  = (lb+ub)/2; // find the mid index
            if(ar[mid] == key){
                System.out.println("key found at " + ar[mid]);
                flag = 1;
                break;
            } else if (ar[mid]<key) {
                lb = mid+1;
            }
            else {
                ub = mid-1;
            }
        }
        if(flag == 0){
            System.out.println("Key not found at here.");
        }
    }
}
