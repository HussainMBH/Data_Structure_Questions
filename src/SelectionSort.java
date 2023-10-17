import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {9,7,8,5,3,4,6,1,2};
        System.out.println(Arrays.toString(arr));

       int n = arr.length;
       for(int i=0; i<n-1; i++){
           int min = i;
           for(int j=i; j<n; j++){
               if(arr[j]<arr[min]){
                   min = j;
               }
           }
           //swapping
           int tmp = arr[min];
           arr[min] = arr[i];
           arr[i] = tmp;
       }
        System.out.println(Arrays.toString(arr));


/***********************************************************************************************************************/
            for(int i=0; i<n-1; i=i+2){
                int tm = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tm;
            }
        System.out.println(Arrays.toString(arr));

    }
}
