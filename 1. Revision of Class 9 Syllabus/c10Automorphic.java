package class10.chapter1;
/**
 * WAP to check for auto e.g. 5->25,25->625
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Automorphic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no");
        int n=sc.nextInt();     //25
        int cd=0,temp=n;        //25
        while(n>0)              //2>0
        {
            cd++;               //2
            n=n/10;             //n=0
        }
        if(temp*temp%Math.pow(10,cd)==temp) //625 % 100 == 25
            System.out.print("Automorphic");
        else
            System.out.print("!Automorphic");
        sc.close();
    }   
}