package class10.chapter1;
/**
 * WAP to input distance travelled by the passenger.
 * Calculate and display the fare to be paid.
 *
 * @author (Ashutosh Sharma)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class c10p92q5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance travelled (km):");
        int d=sc.nextInt();
        int fare=0;
        if(d<=10)
            fare=80;
        else if(d>10 && d<=20)
            fare=80+(d-10)*6;
        else if(d>20 && d<=30)
            fare=80+60+(d-20)*5;
        else
            fare=80+60+50+(d-30)*4;
        System.out.println("Fare to be paid = Rs."+fare);
        sc.close();
    }
}