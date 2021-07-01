/*
WAP to find the sum of the given series up to n-terms by using a function named 
sum(int). Write the main program to display the sum of the series.

S = (1*2) + (2*4) + (3*6) + (4*8) + ------- + n
*/

import java.util.Scanner;

public class revision01072021_2 {

    public int sum(int n)
    {
        int s=0;
        for(int i=1; i<=n; i++)
        s += i*(2*i);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        revision01072021_2 o = new revision01072021_2();
        System.out.print("Enter range of series:");
        int r = sc.nextInt();
        System.out.println("Sum of series is "+o.sum(r));
        sc.close();
    }
}
