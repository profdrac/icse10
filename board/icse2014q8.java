import java.util.Scanner;

/*
Question – 8

Using the switch statement,write a menu driven program :

To calculate the maturity amount of a bank deposit.
The user is given following options:

(i) Term Deposit
(ii)Recurring Deposit

For option(i)accept principle(P),rate of interest(r) and time period years(n).
Calclate and output the maturity amount(A) receivable using the formula:
A = P[1+r/100]power n
For option (ii) accept monthly installment(P) rate of interest(r) and time period(n)
in months and Calculate and output the maturity value(A) receivable using formula :
A=P*n+P*n(n+1)/2*r/100*1/12

For an incorrect option an appropriate message should be displayed.
*/

public class icse2014q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int choice = in.nextInt();
        int p,r,n;
        double a;
        switch(choice)
        {
            case 1:
            System.out.println("Enter Principle ");
            p = in.nextInt();
            System.out.println("Enter rate of Interest ");
            r = in.nextInt();
            System.out.println("Enter the time period ");
            n = in.nextInt();
            a = Math.pow((p*(1+r/100)),n);
            System.out.println("Maturity amount is "+a);
            break;

            case 2:
            System.out.println("Enter Monthly installment");
            p=in.nextInt();
            System.out.println("Enter rate of interest");
            r = in.nextInt();
            System.out.print("Enter time period ");
            n=in.nextInt();
            a=p*n+p*n*(n+1)/2*(r/100)*(1/12);
            System.out.println("Maturity amount is "+a);

            break;
            default: System.out.println("Wrong Choice ");
        }
        in.close();
    }
}
