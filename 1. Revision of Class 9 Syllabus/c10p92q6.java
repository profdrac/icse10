package class10.chapter1;
/**
 * WAP to get marks in English, Maths and Science from the user.
 * Display the appropriate stream allocated!
 *
 * @author (Ashutosh Sharma)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class c10p92q6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks in English, Maths and Science:");
        int e=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        if((e+m+s)/3 >=80)
            System.out.print("Pure Science");
        if((e+m+s)/3 >=60)
            System.out.print("Commerce");
        if(((e+s)/2>=80) && m>=60)
            System.out.print("Bio Science");
        sc.close();
    }   
}