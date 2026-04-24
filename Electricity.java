import java.util.*;
public class Electricity {

     public static void main(String[]args){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Total Units:");
           double unit = sc.nextDouble();
           double bill,extrabill = 0;

           if(unit>=0 && unit<=100){
            bill=1.5*unit+50;
           }
           else if (unit >=101 && unit<=200){
            bill= 3.5*unit+50;
           }
           else{
           bill=  unit*5+50;
           }

           if(bill>2000){
               extrabill=(10/100)*bill;
           }
           System.out.println("Extra bill"+extrabill);
           System.out.println(" Bill"+bill);
           

}
}
