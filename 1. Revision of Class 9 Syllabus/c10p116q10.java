package class10.chapter1;
/**
 * WAP to get runs of a player and display total runs and balls faced
 * -1 = Out
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p116q10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cb=0,runs=0;
        int cr=0;
        do
        {
            System.out.print("Enter runs:");
            cr=sc.nextInt();
            runs=runs+cr;
            cb++;
        }while(cr!=-1);
        runs++;
        System.out.print("Total runs scored are "+runs+" in "+cb+" balls");
        sc.close();
    }   
}