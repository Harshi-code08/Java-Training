import java.util.*;
public class Vending{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int total=0,trayNo;
        do{

        System.out.println("Tray1 | Beverages");
        System.out.println("Tray2 | snacks");
        System.out.println("Tray3 | choclates");

         System.out.println("Select your tray by using(1/2/3/0(Exit))");
         trayNo = sc.nextInt();
         switch(trayNo){
            case 1:
                {
                    char stay;
                    do{
                    System.out.println("a. Coco Cola 30");
                    System.out.println("b. Sprite 60");
                    System.out.println("c. Maaza 50");

                    System.out.println("item to purchase(a/b/c)");
                    char prod= sc.next().charAt(0);

                    if(prod=='a')
                       total+=30;
                    else if(prod=='b')
                       total+=60;
                    else if(prod=='c')
                       total+=50;

                  System.out.println("Stay on same Tray(y/n) :");
                  stay =sc.next().charAt(0);  
                } while(stay!='n');
                  break;
                }
            case 2:
                {
                    char stay;
                    do{
                    System.out.println("a. Lays 50");
                    System.out.println("b. Balaji 60");
                    System.out.println("c. Haldiram 50");

                    System.out.println("item to purchase(a/b/c)");
                    char prod= sc.next().charAt(0);

                    if(prod=='a')
                       total+=50;
                    else if(prod=='b')
                       total+=60;
                    else if(prod=='c')
                       total+=50;

                  System.out.println("Stay on same Tray(y/n) :");
                  stay =sc.next().charAt(0);  
                } while(stay!='n');
                  break;
                }
                
            case 3:
                {
                    char stay;
                    do{
                    System.out.println("a. KitKat 40");
                    System.out.println("b. Cadbury 80");
                    System.out.println("c. Dairy Milk 50");

                    System.out.println("item to purchase(a/b/c)");
                    char prod= sc.next().charAt(0);

                    if(prod=='a')
                       total+=40;
                    else if(prod=='b')
                       total+=80;
                    else if(prod=='c')
                       total+=50;

                  System.out.println("Stay on same Tray(y/n) :");
                  stay =sc.next().charAt(0);  
                } while(stay!='n');
                  break;
                }
            default:
                break;
            
         }
    }
    while(trayNo!=0);
    System.out.println("Total"+total);
    sc.close();         
    }
    
}
