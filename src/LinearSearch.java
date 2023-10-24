public class LinearSearch {
    public static void main(String[] args){
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
    }
}
