package class10.chapter1;
/**
 * WAP to get age of a person and display whether he/she can vote or not
 *
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10_voteIf
{
    c10_voteIf()
    {
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        int age=sc.nextInt();
        if(age>=18)
            System.out.print("You can vote!");
        else
            System.out.print("You cannot vote yet!");
        sc.close();
    }   
}