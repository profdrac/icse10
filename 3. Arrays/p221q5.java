package class10.chapter3;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class p221q5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of students:");
        int c=sc.nextInt();
        String name[]=new String[c];
        int totalmarks[]=new int[c];
        for(int i=0;i<c;i++)
        {
            System.out.print("Enter name and marks of student "+(i+1)+": ");
            name[i]=sc.next();
            totalmarks[i]=sc.nextInt();
        }
        int sum=0,avg;
        for(int i=0;i<c;i++)
        {
            sum=sum+totalmarks[i];
        }
        avg=sum/c;
        System.out.println("Average marks are "+avg);
        for(int i=0;i<c;i++)
        {
            System.out.println(name[i]+" has deviation marks "+(totalmarks[i]-avg));
        }
        sc.close();
    }   
}