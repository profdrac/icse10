import java.util.Scanner;

/*
Question 9:

Write a program to initialize the seven Wonders of the World along with their locations in two different arrays.
Search for a name of the country input by the user. If found, display the name of the country
along with its Wonder, otherwise display “Sorry Not Found!”.

Seven wonders — CHICHEN ITZA, CHRIST THE REDEEMER, TAJMAHAL, GREAT WALL OF CHINA, MACHU PICCHU, PETRA,
COLOSSEUM
Locations — MEXICO, BRAZIL, INDIA, CHINA, PERU, JORDAN, ITALY

Example — Country Name: INDIA   Output: INDIA-TAJMAHAL
Country Name: USA   Output: Sorry Not Found!
*/

class icse2016q9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wonder[] = {"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL", "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM"};
        String country[] = {"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"};
        System.out.print("Enter country name: ");
        String c = sc.next().toUpperCase();
        int p = -1;
        for (int i = 0; i < country.length; i++) {
            if(country[i].equals(c) == true)
            {
                p = i;
                break;
            }
        }
        if(p>=0)
        System.out.println(c + " : " + wonder[p]);
        else
        System.out.println("Sorry Not Found!");
        sc.close();
    }
}