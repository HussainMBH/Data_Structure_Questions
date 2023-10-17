import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int ar[] = {6,4,8,3,5,2,1};
        int n = ar.length;

        int tmp = 0;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(ar[j]<ar[min]){
                    min = j;
                }
            }
            tmp = ar[min];
            ar[min] = ar[i];
            ar[i] = tmp;
        }
        System.out.println(Arrays.toString(ar));
        /***********************************************************************************************************************************************************************************************/
        int tm = 0;
        for(int i=0; i<n-1; i=i+2){
            tm = ar[i];
            ar[i] = ar[i+1];
            ar[i+1] = tm;
        }
        System.out.println(Arrays.toString(ar));
    }
}