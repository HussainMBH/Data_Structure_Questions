package Find_the_number_that_appears_once;

public class Find_the_number_that_once_BF {
    public static int getsingleElement(int []ar){
        //size of the array
        int l = ar.length;

        //run a loop for selecting elements
        for(int i=0; i<l; i++){
            int num = ar[i];
            int cnt = 0;

            //find the occurrence using linear search
            for(int j=0; j<l; j++){
                if(ar[j] == num){
                    cnt++;
                }
            }
            //if the occurrence is 1 return num
            if(cnt == 1){
                return num;
            }
        }
        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String[] args){
        int ar[] = {1,1,2,3,2,4,4,};
        int ans = getsingleElement(ar);
        System.out.println(ans);
    }
}
