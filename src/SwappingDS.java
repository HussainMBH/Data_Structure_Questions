import java.util.Arrays;

public class SwappingDS {
    public static void main(String[] args){
        int arr[] = {6,4,8,3,5,2,1};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int tmp = 0; // temporary

        for(int i=0; i<n-1; i++){
            int min =i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //Swapping
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }

        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
/***********************************************************************************************************************************************************************************************/
        int ars[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(ars));
        int tmps = 0;
        int arn = ars.length;
        for(int i=0; i<arn-1; i=i+2){
            tmps = ars[i];
            ars[i] = ars[i+1];
            ars[i+1] = tmps;
        }
        System.out.println(Arrays.toString(ars));



    }
}
