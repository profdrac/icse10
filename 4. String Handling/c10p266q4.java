package class10.chapter4; 
/**
 * WAP to get a three word name and show surname followed by first and middle names
 * e.g. Mohandas Karamchand Gandhi
 * Output: Gandhi Mohandas Karamchand
 * @author (Ashutosh Sharma)
 */


import java.util.Scanner;
class c10p266q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name containing 3 words:");
        String s=sc.nextLine();
        int lis=s.lastIndexOf(' ');
        System.out.print(s.substring(lis+1)+" ");
        System.out.print(s.substring(0,lis));
        sc.close();
    }   
}