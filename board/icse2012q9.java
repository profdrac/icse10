package board;

import java.util.Scanner;

/*
Question 9:
Write a program to accept the names of 10 cities in a single dimension string array and
their STD (Subscribers Trunk Dialing) codes in another single
dimension integer array. Search for a name of a city input by the user in the list.
If found, display* “Search successful” and print the name of the city along with its STD code,
or else display the message “Search Unsuccessful, No such city in the list”
*/

public class icse2012q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cities[] = {"Amb", "Amroh",  "Ani", "Arki", "Awah Davi", "Baddi", "Bagheri", "Baijnath", "Baldhuk", "Balera"};
        String std[] = {"01976", "01972457", "019045", "01796", "0197275", "01795", "0179566", "01894", "01972418", "0179637"};
        System.out.print("Enter city name whose STD-code is to be searched: ");
        String c = sc.nextLine();
        int p = -1;
        for (int i = 0; i < std.length; i++) {
            if(cities[i].equalsIgnoreCase(c) == true)
            {
                p = i;
                break;
            }
        }
        if(p >= 0)
        System.out.println("Search sucessful! STD-code of " + c + " is " + std[p]);
        else
        System.out.println("Search Unsuccessful, No such city in the list");
        sc.close(); 
    }
}
