/*
Question 4:
Define a class named ParkingLot with the following description :

Instance variables/data members:
-------------------------------
int vno — To store the vehicle number
int hours — To store the number of hours the vehicle is parked in the parking lot
double bill — Tb store the bill amount

Member methods:
---------------
void input( ) — To input and store the vno and hours.
void calculate( ) — To compute the parking charge at the rate of Rs.3 for the first hours or part thereof, and Rs. 1.50 for each additional hour or part thereof.
void display ( ) — To display the detail

Write a main method to create an object of the class and call the above methods.
*/

import java.util.Scanner;

class icse2015q4 {
	
	int vno;
	int hours;
	double bill;

	private void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter vehicle number: ");
		vno = sc.nextInt();
		System.out.print("Enter number of hours: ");
		hours = sc.nextInt();
		sc.close();
	}

	private void calculate() {
		bill = 3 + (hours - 1)*1.50;
	}

	private void display() {
		System.out.println("Parking charge is Rs."+bill);
	}

	public static void main(String args[]) {
		icse2015q4 o = new icse2015q4();
		o.input();
		o.calculate();
		o.display();
	}
}
