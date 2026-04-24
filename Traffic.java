import java.util.*;
class Traffic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int speed =sc.nextInt();
        sc.nextLine();
        String repeated=sc.nextLine();
        int fine=0;
        
        if(speed > 100){
          fine=1000;
        }
        else if(speed > 80){
            fine=500;
        }
        if(repeated){
            fine =fine *fine;
        }
    }
}