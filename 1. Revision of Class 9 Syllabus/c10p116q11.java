package class10.chapter1;
/**
 * WAP to display total fare and no of passengers
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p116q11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int total=0,nop=0;
        int p=0;
        do
        {
            System.out.println("Enter distnace to be travalled by the passenger");
            System.out.println("OR 0 IF PESSENGER IS NOT THERE!!!");
            p=sc.nextInt();
            if(p==0)
                break;
            nop++;
            if(p<=5)
                total=total+80;
            else if(p>5 && p<=15)
                total=total+80+(p-5)*10;
            else
                total=total+80+100+(p-15)*8;
        }while(p!=0);
        System.out.println("No of passengers="+nop);
        System.out.println("Total Fare = Rs."+total);
        sc.close();
    }   
}