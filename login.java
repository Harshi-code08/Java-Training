import java.util.*;
class Login{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int fixdpass=0254;
        int pass;
        int attempts=0;
        while(attempts>3){
            System.out.println("enter password");
            pass=sc.nextInt();
        }
        if(fixdpass==pass){
            System.out.println("");
        }

    }
    }

