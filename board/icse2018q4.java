/*
 *Question 4

Design a class Railway Ticket with following description :

Instance variables/s data members :
-----------------------------------
String name : To store the name of the customer
String coach : To store the type of coach customer wants to travel
long mobno : To store customer’s mobile number
int amt : To store basic amount of ticket
int totalamt : To store the amount to be paid after updating the original amount

Member methods
--------------
void accept ( ) — To take input for name, coach, mobile number and amount
void update ( )— To update the amount as per the coach selected

Type of Coaches 	Amount
---------------		------
First_ AC 		700
Second_AC 		500
Third _AC 		250
sleeper 		None

void display( ) — To display all details of a customer such as name, coach, total amount and mobile number.
Write a main method to create an object of the class and call the above member methods
 * @author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2018q4 {
	
	String name, coach;
	long mobno;
	int amt, totalamt;

	private void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter coach type: ");
		coach = sc.next();
		System.out.print("Enter mobile number: ");
		mobno = sc.nextLong();
		System.out.print("Enter amount: ");
		amt = sc.nextInt();
		sc.close();
	}

	private void update()
	{
		switch(coach)
		{
			case "First_AC":
				totalamt = amt+700;
				break;
			case "Second_AC":
				totalamt = amt+500;
				break;
			case "Third_AC":
				totalamt = amt+250;
				break;
			default:
				totalamt = amt;
		}
	}

	private void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Amount: Rs."+totalamt);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		icse2018q4 o = new icse2018q4();
		o.accept();
		o.update();
		o.display();
		sc.close();
	}
}
