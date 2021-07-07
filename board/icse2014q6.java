import java.util.Scanner;

/*
Question 6:

Write a program to assign a full path and file name as given below. Using library functions,
extract and output the file path, file name and file extension separately as shown.

Input
------
C:/Users/admin/Pictures/flower.jpg

Output
------
path: C:/Users/admin/Pictures/
File name: flower
Extension: jpg
*/

public class icse2014q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full path of the file: ");
        String s = sc.nextLine();
        int ps = s.lastIndexOf("/");
        int pd = s.lastIndexOf(".");
        System.out.println("Path: " + s.substring(0, ps+1));
        System.out.println("File name: " + s.substring(ps+1, pd));
        System.out.println("Extension: " + s.substring(pd+1));
        sc.close();
    }
}
