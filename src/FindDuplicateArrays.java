public class FindDuplicateArrays {
    public static void main(String [] args){
        int ar[] = {1,1,2,3,3,4,5,5,3,6};
        int l = ar.length;
        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(ar[i] == ar[j]){
                    System.out.println(ar[i]);
                }
            }
        }
    }

    public void findeachoneelement(){
        int ar[] = {1,1,2,3,3,4,5,5,6};
        int l = ar.length;
        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(ar[i]==ar[j]){

                }
            }
        }
    }
}
