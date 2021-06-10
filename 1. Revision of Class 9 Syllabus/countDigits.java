package class10.chapter1;
/**
 * WAP to count digits of a no
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class countDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int n = sc.nextInt();   //147
        int cd=0;   
        while(n>0)
        {
            cd++;
            n=n/10;
        }
        System.out.print("Count of digits is "+cd);
        sc.close();
    }   
}