public class checkelements {
    public static void main(String[] args){
        int ar[] = {1,2,3,4,5,6};
        int n = 10;
        int flag = -1;
        for(int i=0; i<ar.length; i++){
            if(ar[i] == n){
                System.out.println("Your elements found here " + n);
                flag = 1;
                break;
            }
        }
        if(flag == -1){
            System.out.println("Your element is not found here");
        }
    }
}
