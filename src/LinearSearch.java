import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){

        LinearSearch ln = new LinearSearch();
        int ar[] = {1,2,3,4,5,4,7,9,8,10};
        int key = 10;
        int i = 0;
        while (i<ar.length){
            if(ar[i] == key){
                System.out.println(key + " is in here." + "Key position index is " + i);
                break;
           }
            i++;
        }
        if (i == ar.length) {
            System.out.println(key + " is not in here, Sorry.");
        }

        ln.linearsearch();
    }

    public void linearsearch(){
        int arr[] = {1,2,3,4,5,6};
        int flag = 0;
        Scanner scn = new Scanner(System.in);
        int key = scn.nextInt();
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                System.out.println(key + " Value is Found in here.");
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println(key + " Value is not in here.");
        }
    }
}
