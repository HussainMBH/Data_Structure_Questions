package Find_Missing_Number_Array;

public class Find_Missing_Number_using_array_add {
    public static int missingnumber(int []a, int l){

        int sum = 0;
        for(int i=0; i<l; i++){
            sum = sum + a[i];
        }
        return l*(l+1)/2 - sum;
    }

    public static void main(String[] args){


        int a[] = {1, 2, 4, 5};
        int l = a.length;
        int ans = missingnumber(a, l);
        System.out.println("Missing Number is " + ans);
    }
}
