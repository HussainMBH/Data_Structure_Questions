package Find_Missing_Number_Array;

public class FInd_Missing_Number_Array_Hashing {
    public static int missingNumber(int []a, int l){
        int hash[] = new int[l +1]; //hash array

        //storing the frequencies
        for(int i=0; i<l-1; i++){
            hash[a[i]]++;
        }
        //checking the frequencies for numbers 1 to l
        for (int i = 1; i<=l; i++ ){
            if(hash[i] == 0){
                return i;
            }
        }
        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String args[]) {
        int l = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, l);
        System.out.println("The missing number is: " + ans);
    }
}
