package board;

import java.util.Scanner;

/*
Question 4:
Define a class called mobike with the following description:

Instance variables /data members:
---------------------------------
int bno — to store the bike’s number
int phno — to store the phone number of the customer
String name — to store the name of the customer
int days — to store the number of days the bike is taken on rent
int charge — 4 calculate and store the rental charge

Member methods:
---------------
void input() — to input and store the detail of the customer

void compute() — to compute the rental charge.

The rent for a mobike is charged on the following basis:
First five days Rs. 500 per day.
Next five days Rs. 400 per day.
Rest of the days Rs. 200 per day.

void display() — to display the details in a table
*/

public class icse2011q4 {

    int bno, phno, days, charge;
    String name;

    private void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter bike no: ");
        bno = sc.nextInt();
        System.out.print("Enter phone no: ");
        phno = sc.nextInt();
        System.out.print("Enter number of days: ");
        days = sc.nextInt();
        sc.close();
    }

    private void compute()
    {
        if(days <= 5)
        charge = days*500;
        else if(days >5 && days <= 10)
        charge = 2500 + (days-5)*400;
        else
        charge = 2500 + 2000 + (days-10)*200;
    }

    private void display()
    {
        System.out.println("Name\tBike-No\tPhone\tDays\tCharge");
        System.out.println(name + "\t"+ bno + "\t" + phno + "\t" + days + "\t" + charge);
    }

    public static void main(String[] args) {
        icse2011q4 o = new icse2011q4();
        o.input();
        o.compute();
        o.display();
    }    
}
