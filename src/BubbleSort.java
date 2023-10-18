import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {7,6,4,3,8,9,1};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }

            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
