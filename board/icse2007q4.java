package board;

import java.util.Scanner;

/*
Question 4:
Define a class salary described as below :
Data Members: Name, Address, Phone, Subject Specialisation, Monthly Salary, Income Tax.
Member methods:
(i) To accept the details of a teacher including the monthly salary.
(ii) To display the details of the teacher.
(iii) To compute the annual Income Tax as 5% of the annual salary above Rs. 1,75,000/-.
Write a main method to create object of a class and call the above member method.
*/
public class icse2007q4 {
    String Name;
    String Address;
    long Phone;
    String Subject_Specialisation;
    double Monthly_Salary;
    double Income_Tax;
    
    private void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        Name = sc.nextLine();
        System.out.print("Enter address: ");
        Address = sc.nextLine();
        System.out.print("Enter phone: ");
        Phone = sc.nextLong();
        System.out.print("Enter subject: ");
        Subject_Specialisation = sc.nextLine();
        System.out.print("Enter monthly salary: ");
        Monthly_Salary = sc.nextDouble();
        sc.close();
    }

    private void compute()
    {
        Income_Tax = (Monthly_Salary*12 - 175000) * 0.05;
        Income_Tax = Income_Tax<0 ? 0 : Income_Tax;
    }

    private void display()
    {
        System.out.println("Name: "+Name);
        System.out.println("Address: "+Address);
        System.out.println("Phone: "+Phone);
        System.out.println("Subject: "+Subject_Specialisation);
        System.out.println("Monthly Salary: Rs."+Monthly_Salary);
        System.out.println("Income Tax: Rs."+Income_Tax);
    }

    public static void main(String[] args) {
        icse2007q4 o = new icse2007q4();
        o.input();
        o.compute();
        o.display();
    }
}