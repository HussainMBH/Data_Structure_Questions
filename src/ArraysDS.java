public class ArraysDS {
    static int ar[] = {3,6,4,2,8,9,10,5,7,1};
    static int maxm = ar[0];
    static int n= ar.length;
    public static void main(String [] args){
        ArraysDS objarrays = new ArraysDS();
        objarrays.maximumelement();
        System.out.println();
        objarrays.findsecondmaximum();
        System.out.println();
        objarrays.smallestnum();
    }

    public void maximumelement(){


        System.out.println(ar.length);

        System.out.println("n-1 = " + (n-1));
        System.out.println("Finding Maximum Element");

        for(int i=0; i<n-1; i++){
            if(ar[i]>maxm){
                maxm = ar[i];
            }
        }
        System.out.println("Method 01 >> Maximum Number: "+maxm);

        int mx = 0;
        for(int i=0; i<=n-1; i++){
            mx = Math.max(mx, ar[i]);
        }
        System.out.println("Method 02 >> Maximum Number: " + mx);
    }

    public void findsecondmaximum(){
        System.out.println("Finding Second Maximum Element Method");
        int ar[] = {3,6,4,2,8,9,10,5,7,1};
        int secondlargest = 0;
        for(int i=0; i<n-1; i++){
            if(ar[i]>maxm){
                maxm = ar[i];
            }

            if(ar[i]> secondlargest && ar[i]!= maxm){
                secondlargest = ar[i];
            }
        }
        System.out.println("Second Maximum Number: "+secondlargest);
    }
    public void smallestnum(){
        System.out.println("Finding Smallest Number");
        for(int i=0; i<n; i++){
            if(ar[i]<maxm){
                maxm = ar[i];
            }
        }
        System.out.println("Method 01 >> Minimum Number: "+maxm);

        for(int i=0; i<n; i++){
            maxm = Math.min(maxm, ar[i]);
        }
        System.out.println("Method 02 >> Minimum Number: "+maxm);
    }
}
