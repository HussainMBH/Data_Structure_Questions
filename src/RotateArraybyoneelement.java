import java.util.Arrays;

public class RotateArraybyoneelement {
    public static void main(String[] args){
        int ar[] = {1,2,3,4,5,6};
        int n = ar.length;
        int tmp = ar[0];
        for(int i=1; i<ar.length; i++){
            ar[i-1] = ar[i];
        }
        ar[n-1] = tmp; //Assign n-1
        System.out.println(Arrays.toString(ar));
    }
}
