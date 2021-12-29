package class10.chapter3;


/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class p221q10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[20];
        int even[] = new int[20];
        int odd[] = new int[20];
        System.out.print("Enter 20 numbers:");
        for(int i=0;i<20;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ie=0,io=0;
        for(int i=0;i<20;i++)
        {
            if(arr[i]%2==0)
            {
                even[ie] = arr[i];
                ie++;
            }
            else
            {
                odd[io] = arr[i];
                io++;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(even[i]!=0)
                System.out.print(even[i]+" ");
        }
        for(int i=0;i<20;i++)
        {
            if(odd[i]!=0)
                System.out.print(odd[i]+" ");
        }
        sc.close();
    }   
}