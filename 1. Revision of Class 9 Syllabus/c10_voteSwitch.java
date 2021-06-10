package class10.chapter1;
/**
 * WAP to check whether a user can vote or not
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10_voteSwitch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        int age=Math.abs(sc.nextInt());
        switch(age)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.print("You cannnot vote");
                break;
            default:
                System.out.print("You can vote");
        }
        sc.close();
    }   
}