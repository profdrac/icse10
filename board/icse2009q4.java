package board;

import java.util.Scanner;

/*
Question 4:
An electronics shop has announced the following seasonal discounts on the purchase of certain items.

Purchase Amount in Rs.	Discount on Laptop	Discount on Desktop PC
0—25000	                0.0%	            5.0%
25001—57000	            5.0%	            7.5%
57001—100000	        7.5%	            10.0%
More than 100000	    10.0%	            15.0%

Write a program based on the above criteria, to input name, address, amount of purchase and
the type of purchase (L for Laptop and D for Desktop) by a customer. Compute and print
the net amount to be paid by a customer along with his name and address.
(Hint : discount = (discount rate! 100)* amount of purchase Net amount = amount of purchase – discount)
*/

class icse2009q4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter amount of purchase: ");
        double amt = sc.nextDouble();
        System.out.print("Did you buy a Laptop(L) or a Desktop(D)? ");
        char ch = sc.next().charAt(0);
        double dis = 0;
        switch(ch)
        {
            case 'l':
            case 'L':
            if(amt <= 25000)
            dis = 0;
            else if(amt>25000 && amt<=57000)
            dis = amt*0.05;
            else if(amt>57000 && amt<=100000)
            dis = amt*0.075;
            else
            dis = amt*0.1;
            break;

            case 'd':
            case 'D':
            if(amt <= 25000)
            dis = 0.05;
            else if(amt>25000 && amt<=57000)
            dis = amt*0.075;
            else if(amt>57000 && amt<=100000)
            dis = amt*0.1;
            else
            dis = amt*0.15;
        }
        System.out.println("Name\tAddress\tAmount\tDiscount\tPayable");
        System.out.println(name+"\t"+address+"\t"+amt+"\t"+dis+"\t"+(amt-dis));
        sc.close();
    }
}