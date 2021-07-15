import java.util.Scanner;

/*
Question 4.

Define a class ElectricBill with the following specifications :

class : ElectricBill

Instance variables /data member :
---------------------------------
String n – to store the name of the customer
int units – to store the number of units consumed
double bill – to store the amount to be paid

Member methods :
-----------------
void accept ( ) – to accept the name of the customer and number of units consumed

void calculate ( ) – to calculate the bill as per the following tariff :
No. of Units        Rate per unit
------------        -------------
First 100           Rs. 2.00
Next 200            Rs. 3.00
Above 300           Rs. 5.00
A surcharge of 2.5% charged if the number of units consumed is above 300 units.

void print()
Name : ....................
Number of units : .........
Bill Amount : .............

Write a main method to create an object of the class and call the above member methods.
*/

class icse2017q4{
    
    String n;
    int units;
    double bill;

    private void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        n = sc.nextLine();
        System.out.print("Enter units consumed: ");
        units = sc.nextInt();
        sc.close();
    }

    private void calculate()
    {
        if(units<=100)
        bill = units*2.00;
        else if(units>100 && units<=200)
        bill = 200 + (units-100)*3.00;
        else
        bill = 200 + 600 + (units-300)*5.00;
    }

    private void print()
    {
        System.out.println("Name : "+n);
        System.out.println("Number of units : "+units);
        System.out.println("Bill Amount : Rs."+bill);
    }

    public static void main(String[] args) {
        icse2017q4 o = new icse2017q4();
        o.accept();
        o.calculate();
        o.print();
    }
}