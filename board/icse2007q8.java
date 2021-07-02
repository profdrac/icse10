package board;

import java.util.Scanner;

/*
Question 8:
Using a switch statement, write a menu driven program to convert a given temperature from Fahrenheit to Celsius and vice versa. For an incorrect choice, an appropriate error message should be displayed.
(HINT : C = 5/9 × (F – 32) and F = 1.8 × (C + 32) 
*/
public class icse2007q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Fahrenheit to Celsius");
        System.out.println("[2] Celsius to Fahrenheit");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.print("Enter temperature: ");
            double f = sc.nextDouble();
            double c = (5.0/9.0) * (f-32);
            System.out.println(c+" degree celsius");
            break;
            case 2:
            System.out.print("Enter temperature: ");
            c = sc.nextDouble();
            f = 1.8*(c+32);
            System.out.println(c+" degree fahrenheit");
            break;
            default:
            System.out.println("Not an option");
        }
        sc.close();
    }
}
