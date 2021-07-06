import java.util.Scanner;

/*
Question 4:
Define a class named Fruit Juice with the following description:

Instance variables / data members :
------------------------------------
int product_code — stores the product code number
String flavour — stores the flavour of the juice (E.g. orange, apple, etc.)
String pack_type — stores the type of packaging (E.g. tetra-pack, PET bottle, etc.)
int pack_size — stores package size (E.g. 200 ml, 400 ml, etc.)
int product_price — stores the price of the product

Member methods :
----------------
(i) FruitJuice() — Default constructor to initialize integer data members to 0 and String data members to.
(ii) void input( ) — To input and store the product code, flavour, pack type, pack size and product price.
(iii) void discount( ) — To reduce the product price by 10.
(iv) void display() — To display the product code, flavour, pack type, pack size and product price
*/

class icse2013q4
{
    
    int product_code, pack_size, product_price;
    String flavour, pack_type;

    icse2013q4()
    {
        //FruitJuice()
        product_code = 0;
        pack_size = 0;
        product_price = 0;
        flavour = "";
        pack_type = "";
    }

    private void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter flavour: ");
        flavour = sc.nextLine();
        System.out.print("Enter pack-type: ");
        pack_type = sc.nextLine();
        System.out.print("Enter product code: ");
        product_code = sc.nextInt();
        System.out.print("Enter pack size: ");
        pack_size = sc.nextInt();
        System.out.print("Enter product price: ");
        product_price = sc.nextInt();
        sc.close();
    }

    private void discount()
    {
        product_price -= 10;
    }

    private void display()
    {
        System.out.println("Code\tFlavour\tPack-Type\tPack-Size\tPrice");
        System.out.println(product_code + "\t" + flavour + "\t" + pack_type + "\t" + pack_size + "\t" + product_price);
    }
    public static void main(String[] args) {
        icse2013q4 o = new icse2013q4();
        o.input();
        o.discount();
        o.display();
    }
}