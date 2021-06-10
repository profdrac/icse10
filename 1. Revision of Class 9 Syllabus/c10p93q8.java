package class10.chapter1;
/**
 * WAP to print charge for sending a parcel
 *
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p93q8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight of the parcel (gm):");
        int w=sc.nextInt();
        System.out.print("Enter type of booking [O/E]:");
        char t=sc.next().charAt(0);
        int c;
        if(w<=100)
       {
           if(t=='O')
            c=80;
           else
            c=100;
        }
        else if(w>100 && w<=500)
            c=(t=='O')?150:200;
        else if(w>500 && w<=1000)
            c=(t=='O')?210:250;
        else
            c=(t=='O')?250:300;
        System.out.println("\fCharge = Rs."+c);
        sc.close();
    }   
}