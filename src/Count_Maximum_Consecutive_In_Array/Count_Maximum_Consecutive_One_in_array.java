package Count_Maximum_Consecutive_In_Array;

public class Count_Maximum_Consecutive_One_in_array {
    public static void main(String[] args){
        int a[] = {0,1,1,1,0,0,1,1,1,1,0,1};
        int count =0;
        int maxi = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == 1){
                count++;
            }
            else {
                count=0;
            }
            maxi = Math.max(maxi, count);
        }
        System.out.println(maxi);
    }
}
