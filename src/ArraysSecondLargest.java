public class ArraysSecondLargest {
    public static void main(String[] args){
        int ar[] = {2,6,8,5,3,7,10,1,4,9};
        int l = ar.length;
        int maximum = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        for(int i=0; i<l; i++){
            if(ar[i]>maximum){
                secondlarge = maximum;
                maximum = ar[i];
            } else if (ar[i]>secondlarge && ar[i]!=maximum) {
                secondlarge = ar[i];
            }
        }
        System.out.println(secondlarge);
    }
}
