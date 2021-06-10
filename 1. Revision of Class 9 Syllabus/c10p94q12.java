package class10.chapter1;
/**
 * WAP (md) to print depreciared value of a car
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p94q12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter showroom-price of the car: Rs.");
        double sp=sc.nextDouble();
        System.out.print("For how many years was the car used? ");
        int y=sc.nextInt();
        double dep=0;
        if(y>0)
        {
        switch(y)
        {
            case 1:
                dep=sp*10/100;
                break;
            case 2:
                dep=sp*20/100;
                break;
            case 3:
                dep=sp*30/100;
                break;
            case 4:
                dep=sp*50/100;
                break;
            default:
                dep=sp*60/100;
        }
    }
        double dp=sp-dep;
        System.out.println("Showroom price of the car is Rs."+sp);
        System.out.println("Depreciation is Rs."+dep);
        System.out.println("Depreciated price of the car is Rs."+dp);
        sc.close();
    }   
}