import java.util.Scanner;

/*

Question 4:
Define a class named BookFair with the following description:

Instance variables/Data members :
--------------------------------
String Bname — stores the name of the book
double price — stores the price of the book 

Member methods :
-----------------
(i) BookFair() — Default constructor to initialize data members
(ii) void Input() — To input and store the name and the price of the book.
(iii) void calculate() — To calculate the price after discount. 

Discount is calculated based on the following criteria.

Price	                                                Discount
-----                                                   --------
Less than or equal to Rs. 1000	                        2% of price
More than Rs. 1000 and less than or equal to Rs. 3000	10% of price
More than % 3000	                                    15% of price

(iv) void display() — To display the name and price of the book after discount. Write a main method to
create an object of the class and call the above member methods.
*/

class icse2016q4 {
    
    String Bname;
    double price;

    icse2016q4() {
        Bname = "";
        price = 0;
    }

    private void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        Bname = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.close();
    }

    private void calculate() {
        if(price <= 1000)
        price = price - (price*0.2);
        else if(price>1000 && price<=3000)
        price = price - (price*0.10);
        else
        price = price - (price*0.15);
    }

    private void display() {
        System.out.println("Book name = "+Bname);
        System.out.println("Price after discount = Rs."+price);
    }

    public static void main(String[] args) {
        icse2016q4 o = new icse2016q4();
        o.input();
        o.calculate();
        o.display();
    }
}