import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int ar[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(ar));
        int n = ar.length;
        for(int i=0; i<n-1; i++){
            int min =i;
            for(int j=i; j<n; j++){
                if(ar[j]<ar[min]){
                    min = j;
                }
            }
            int tmp = ar[min];
            ar[min] = ar[i];
            ar[i] = tmp;
        }
        System.out.println(Arrays.toString(ar));
        /***********************************************************************************************************************************************************************************************/
        for(int i=0; i<n-1; i=i+2){
            int tm = ar[i];
            ar[i] = ar[i+1];
            ar[i+1] = tm;
        }
        System.out.println(Arrays.toString(ar));
    }
}