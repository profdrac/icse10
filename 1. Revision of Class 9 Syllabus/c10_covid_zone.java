package class10.chapter1;
/**
 * WAP to display the zone depending on number from user
 *
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10_covid_zone
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of infected persons:");
        int n=sc.nextInt();
        //0-green
        //1-100-Orange
        //>100 - Red
        if(n==0)
            System.out.print("Green Zone!");
        else if(n>0 && n<=100)
            System.out.print("Orange Zone!");
        else
            System.out.print("Red Zone!");
        sc.close();
    }   
}