/*
 *Question 4.

Design a class name ShowRoom with the following description :
Instance variables/ Data members :
----------------------------------
String name – To store the name of the customer
long mobno – To store the mobile number of the customer
double cost – To store the cost of the items purchased
double dis – To store the discount amount
double amount – To store the amount to be paid after discount
Member methods: –
-----------------
ShowRoom() – default constructor to initialize data members
void input() – To input customer name, mobile number, cost
void calculate() – To calculate discount on the cost of purchased items, based on following criteria

Cost 							Discount (in percentage)
----------------------------				------------------------
Less than or equal to ₹ 10000 				5%
More than ₹ 10000 and less than or equal to ₹ 20000 	10%
More than ₹ 20000 and less than or equal to ₹ 35000 	15%
More than ₹ 35000 					20%

void display() – To display customer name, mobile number, amount to be paid after discount

Write a main method to create an object of the class and call the above member methods

 * @author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2019q4 {

	String name;
	long mobno;
	double cost;
	double dis;
	double amount;

	icse2019q4()
	{
		name = "";
		mobno = 0;
		cost = 0;
	}
	
	private void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter mobile number: ");
		mobno = sc.nextLong();
		System.out.print("Enter cost: Rs.");
		cost = sc.nextDouble();
		sc.close();
	}

	private void calculate()
	{
		if(cost<=10000)
			dis = cost*0.05;
		else if(cost>10000 && cost<=20000)
			dis = cost*0.1;
		else if(cost>20000 && cost<=35000)
			dis = cost*0.15;
		else
			dis = cost*0.2;
		amount = cost - dis;
	}

	private void display()
	{
		System.out.println("Name\tMobile\tAmount");
		System.out.println(name+"\t"+mobno+"\t"+amount);
	}

	public static void main(String args[]) {
		icse2019q4 o = new icse2019q4();
		o.input();
		o.calculate();
		o.display();
	}
}
