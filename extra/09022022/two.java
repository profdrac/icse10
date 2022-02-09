/*
WAP to create two arrays: first having names of five countries and second having the names of their capitals.
Ask user for the name of a country, search that country in array. If present show the name of country and the name of its capital,
otherwise show the message "Country not found!"
 */
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String co[]={"India", "Nepal", "USA", "China", "Italy"};
        String ca[]={"New Delhi", "Kathmandu", "Washington DC", "Beijing", "Rome"};
        System.out.print("Enter country whose capital is to be found: ");
        String s=sc.next();
        int p=-1;
        for (int i = 0; i < 5; i++) {
            if(co[i].equalsIgnoreCase(s)==true)
            {
                p=i;
                break;
            }
        }
        if(p>=0)
            System.out.println(co[p]+" = "+ca[p]);
        else
            System.out.println("Country not found!");
        sc.close();
    }
}