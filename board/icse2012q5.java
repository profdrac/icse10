package board;

import java.util.Scanner;

/*
Question 5:
Given below is a hypothetical table showing rates of Income Tax for male citizens below the age of 65 years :

Taxable Income (TI) in Rs.	    Income Tax in Rs.
---------------------------     -----------------
Does not exceed Rs. 1,60,000	Nil
Is greater than Rs. 1,60,000 and less than or equal to Rs. 5,00,000	(TI—1,60,000) × 10%
Is greater than Rs. 5,00,000 and less than or equal to Rs. 8,00,000	[(TI—5,00,000 × 20%] + 34,000
Is greater than Rs. 8,00,000	[(TI—8,00,000 × 30%] + 94,000

Write a program to input the age, gender (male or female) and Taxable Income of a person.
If the age is more than 65 years or the gender is female, display “wrong category”.
If the age is less than or equal to 65 years and the gender is male, compute and display the Income Tax payable as a table
*/

public class icse2012q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender [M/F]: ");
        char gender = sc.next().charAt(0);
        double tax = 0;
        System.out.print("Enter income: ");
        double income = sc.nextDouble();
        if(age <= 65)
        {
            if(income <= 160000)
            tax = 0;
            else if(income > 160000 && income <=500000)
            tax = (income - 160000)*0.1;
            else if(income > 500000 && income <=800000)
            tax = (income - 500000)*0.2 + 34000;
            else
            tax = (income - 800000)*0.3 + 94000;
            System.out.println("Age\tGender\tIncome\tTax");
            System.out.println(age+"\t"+gender+"\t"+income+"\t"+tax);
        }
        else
        System.out.println("Wrong category");
        sc.close();
    }
}
