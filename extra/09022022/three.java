/*
WAP to search a number in an array of 10 numbers using binary search
 */
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[]={10,20,22,30,32,45,50,55,62,67};
        System.out.print("Enter a number to be searched:");
        int x=sc.nextInt();
        int p=-1;
        int lb=0,ub=9;
        while(lb<=ub)
        {
            int cb=(lb+ub)/2;
            if(n[cb]<x)
                lb=cb+1;
            else if(n[cb]>x)
                ub=cb-1;
            else
            {
                p=cb;
                break;
            }
        }
        if(p>=0)
            System.out.println("Number found at position "+p);
        else
            System.out.println("Number not found!");
        sc.close();
    }
}