import java.util.Scanner;

/*
Question 4:
Define a class named movieMagic with the following description:

Instance variables/data members:
int year — to store the year of release of a movie.
String title — to-store the title of the movie
float rating — to store the popularity rating of the movie
(minimum rating=0.0 and maximum rating=5.0)

Member methods:
(i) movieMagic() Default constructor to initialize numeric data members to 0 and String data member to “ ”.
(ii) void accept() To input and store year, title and rating.
(iii) void display() To display the title of a movie and a message based on the rating as per the table below.

Rating	    Message to be displayed
-------     -----------------------
0.0 to 2.0	Flop
2.1 to 3.4	Semi-hit
3.5 to 4.5	Hit
4.6 to 5.0	Super Hit

Write a main method to create an object of the class and call the above member methods
*/

//class movieMagic
class icse2014q4
{

    int year;
    String title;
    float rating;

    //movieMagic()
    icse2014q4()
    {
        year = 0;
        rating = 0;
        title = "";
    }
    
    private void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter year of release: ");
        year = sc.nextInt();
        System.out.print("Enter rating [0.0 - 5.0]: ");
        rating = sc.nextFloat();
        sc.close();
    }

    private void display()
    {
        System.out.println("Rating\tMessage");
        if(rating>= 0.0 && rating<= 2.0)
        System.out.println(rating + "\tFlop");
        else if(rating>= 2.1 && rating<= 3.4)
        System.out.println(rating + "\tSemi-Hit");
        else if(rating>= 3.5 && rating<= 4.5)
        System.out.println(rating + "\tHit");
        else
        System.out.println(rating + "\tSuper-Hit");
    }
    
    public static void main(String[] args) {
        //movieMagic o = new movieMagic();
        icse2014q4 o = new icse2014q4();
        o.accept();
        o.display();
    }
}