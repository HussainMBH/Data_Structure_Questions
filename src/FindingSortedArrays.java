import java.util.Arrays;

public class FindingSortedArrays {

    public static void main(String[] args){
        FindingSortedArrays fndsorted = new FindingSortedArrays();
        boolean findSorted = fndsorted.findSorted();
        if (findSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }


        boolean findUndsorted = fndsorted.findUnsorted();
        if (findUndsorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
    public boolean findSorted(){
        int SortedArray[] = {1,2,3,4,5,6};

        int l = SortedArray.length;

        System.out.println("Sorted Array: "+ Arrays.toString(SortedArray));
        for(int i=1; i<l; i++){
            if(SortedArray[i]>=SortedArray[i-1]){

            }
            else {
                return false;
            }
        }
        return true;
    }
    public boolean findUnsorted(){
        int UnSortedArray[] = {4,1,9,6,5};
        int len = UnSortedArray.length;
        for(int j=0; j<len; j++){
            if(UnSortedArray[j]>=UnSortedArray[j-1]){

            }
            else {
                return true;
            }

        }
        return false;
    }
}
