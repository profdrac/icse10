package board;

import java.util.Scanner;

/*
Question 4:
Define a class called Library with the following description :

Instance variables/data members :
int acc_num — stores the accession number of the book
String title — stores the title of the book
String author — stores the name of the author

Member methods:
(i) void input ( ) — To input and store the accession number, title and author.
(ii) void compute ( ) — To accept the number of days late, calculate the display the fine charged at the rate of Rs. 2 per day.
(iii) void display( ) — To display the details in the following format:
Accession      Number      Title Author

Write a main method to create an object of the class and call the above member methods.
*/

class icse2012q4
{
    int acc_num;
    String title, author;
    int days, fine;
    
    private void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title of the book: ");
        title = sc.nextLine();
        System.out.print("Enter name of the author: ");
        author = sc.nextLine();
        System.out.print("Enter accession number: ");
        acc_num = sc.nextInt();
        System.out.print("Enter days: ");
        days = sc.nextInt();
        sc.close();
    }

    private void compute()
    {   
        fine = days*2;
    }

    private void display()
    {
        System.out.println("Accession\title\tAuthor\tFine");
        System.out.println(acc_num+"\t"+title+"\t"+author+"\t"+fine);
    }
    
    public static void main(String[] args) {
        icse2012q4 o = new icse2012q4();
        o.input();
        o.compute();
        o.display();
    }
}