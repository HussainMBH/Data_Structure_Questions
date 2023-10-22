public class FindingSortedArrays {

    public static void main(String[] args){
        FindingSortedArrays fndsorted = new FindingSortedArrays();
        fndsorted.findSorted();
    }
    public boolean findSorted(){
        int SortedArray[] = {1,2,3,4,5,6};
        int UnSortedArray[] = {4,1,9,6,5};
        int l = SortedArray.length;
        int len = UnSortedArray.length;
        for(int i=1; i<l; i++){
            if(SortedArray[i]>=SortedArray[i-1]){

            }
            else {
                return false;
            }
        }
        return true;


    }
}
