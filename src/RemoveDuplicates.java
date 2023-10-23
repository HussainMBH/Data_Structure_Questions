public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Removing Duplicate Second Method");
        int ar[] = {1,1,2,3,3,3,4,5,5};
        int readd = -1;
        for(int i=0; i<ar.length; i++){
            if(ar[i] != -1){
                for(int j=i+1; j<ar.length; j++){
                    if(ar[i] == ar[j]){
                        ar[j]=readd;
                    }
                }
                System.out.print(ar[i] + " ");
            }
        }

    }
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
