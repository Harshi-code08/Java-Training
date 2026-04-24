import java.util.*;
class Warehouse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int total=0;

        for(int i=1;i<=n;i++){
            int currStock=sc.nextInt();
            int min_require=sc.nextInt();

            if(currStock<min_require){
                System.out.println("Restock needed for product "+i);
             total++;
            }
        }


       System.out.println("Total number of products need to"+total);
    }
}