package board;

import java.util.Scanner;

/*
Question 6:
Shasha Travels Pvt. Ltd. gives the following discount to its customers:

Ticket amount	        Discount
Above Rs. 70000	        18%
Rs. 55001 to Rs. 70000	16%
Rs. 35001 to Rs. 55000	12%
Rs. 25001 to Rs. 35000	10%
less than Rs. 25001	    2%
Write a program to input the name and ticket amount for the customer and
calculate the discount amount and net amount to he paid. Display the output
in the following format for each customer:
S.No.       Name        Ticket-Charge       Discount        Net-Amount
-----       ----        ------------        --------        ----------

(Assume that there are 15 customers, first customer is given the serial no (SI. No.) 1,
next customer 2.. and so on) 
*/

public class icse2010q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[15];
        double charge[] = new double[15];
        for (int i = 0; i < charge.length; i++) {
            System.out.print("Enter name of customer "+(i+1)+": ");
            names[i] = sc.nextLine();
            System.out.print("Enter ticket-charge of customer "+(i+1)+": ");
            charge[i] = sc.nextDouble();
        }
        System.out.println("S.No\tName\tTicket-Charge\tDiscount\tNet-Amount");
        for (int i = 0; i < charge.length; i++) {
            double dis = 0;
            double ch = charge[i];
            if(ch <= 25001)
            dis = ch*0.02;
            else if(ch >= 25001 && ch<=35000)
            dis = ch*0.1;
            else if(ch >= 35001 && ch<=55000)
            dis = ch*0.12;
            else if(ch >= 55001 && ch<=70000)
            dis = ch*0.16;
            else
            dis = ch*0.18;
            System.out.println((i+1) + "\t" + names[i] + "\t" + ch + "\t" + dis + "\t" + (ch-dis));
        }
        sc.close();
    }    
}
