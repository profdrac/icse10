package class10.chapter3;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class p221q6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[50];
        int totalmarks[]=new int[50];
        for(int i=0;i<50;i++)
        {
            System.out.print("Enter name and marks of student "+(i+1)+": ");
            name[i]=sc.next();
            totalmarks[i]=sc.nextInt();
        }
        int sum=0,avg;
        for(int i=0;i<50;i++)
        {
            sum=sum+totalmarks[i];
        }
        avg=sum/50;
        System.out.println("Average marks are "+avg);
        int g=0;
        for(int i=0;i<50;i++)
        {
            if(totalmarks[i]>g)
                g=totalmarks[i];
        }
        System.out.println("Highest marks are "+g);
        sc.close();
    }   
}