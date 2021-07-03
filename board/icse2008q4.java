package board;
/*
Question 4:
Define a class employee having the following description :
Data members/instance variables:
int pan — to store personal account number
String name — to store name
double tax income — to store annual taxable income
double tax — to store tax that is calculated
Member functions:
input() — Store the pan number, name, taxable income
calc() — Calculate tax for an employee
display() — Output details of an employee
Write a program to compute the tax according to the given conditions and display the output as per given format. 
Total annual Taxable Income	Tax Rate
Upto Rs. 1,00,000	No tax
From 1,00,001 to 1,50,000	10% of the income exceeding Rs. 1,00,000
From 1,50,001 to 2,50,000	Rs. 5,000 + 20% of the income exceeding Rs. 1,50,000
Above Rs. 2,50,000	Rs. 25,000 + 30% of the income exceeding Rs. 2,50,000.
*/

import java.util.Scanner;

public class icse2008q4 {

    int pan;
    String name;
    double tax_income;
    double tax;

    private void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter PAN: ");
        pan = sc.nextInt();
        System.out.print("Enter income: Rs.");
        tax_income = sc.nextDouble();
        sc.close();
    }

    private void calc()
    {
        if(tax_income<=100000)
        tax = 0;
        else if(tax_income>100000 && tax_income<=150000)
        tax = (tax_income-100000) * 0.1;
        else if(tax_income>150000 && tax_income<=250000)
        tax = 5000 + (tax_income-150000) * 0.2;
        else
        tax = 25000 + (tax_income-250000) * 0.3;
    }

    private void display()
    {
        System.out.println("PAN\tName\tIncome\tTax");
        System.out.println(pan+"\t"+name+"\t"+tax_income+"\t"+tax);
    }

    public static void main(String[] args) {
        icse2008q4 o = new icse2008q4();
        o.input();
        o.calc();
        o.display();
    }
}
