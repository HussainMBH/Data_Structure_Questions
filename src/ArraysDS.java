public class ArraysDS {
    static int ar[] = {3,6,4,2,8,9,10,5,7,1};
    static int maxm = ar[0];
    static int n= ar.length;
    public static void main(String [] args){
        ArraysDS objarrays = new ArraysDS();
        objarrays.maximumelement();
        objarrays.findsecondmaximum();
    }

    public void maximumelement(){
        System.out.println("Finding Maximum Element");

        System.out.println(ar.length);

        System.out.println("n-1 = " + (n-1));

        for(int i=0; i<n-1; i++){
            if(ar[i]>maxm){
                maxm = ar[i];
            }
        }
        System.out.println(maxm);
    }

    public void findsecondmaximum(){
        System.out.println("Finding Second Maximum Element");
        int ar[] = {3,6,4,2,8,10,10,5,7,1};
        int secondlargest = 0;
        for(int i=0; i<n-1; i++){
            if(ar[i]>maxm){
                maxm = ar[i];
            }

            if(ar[i]> secondlargest && ar[i]!= maxm){
                secondlargest = ar[i];
            }
        }
        System.out.println(secondlargest);
    }
}
