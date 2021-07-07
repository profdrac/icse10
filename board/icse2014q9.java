import java.util.Scanner;

/*
Question 9:
Write a program to accept the year of graduation from school as an integer value from,
the user. Using the Binary Search technique on the sorted array of integers given below.
Output the message “Record exists” If the value input is located in the array.
If not, output the message “Record does not exist”.

{1982, 1987, 1993, 1996. 1999, 2003, 2006, 2007, 2009, 2010}
*/
public class icse2014q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
        System.out.print("Enter year to be searched: ");
        int y = sc.nextInt();
        int lb = 0, ub = year.length-1;
        int p = -1;
        while (lb<=ub) {
            int cb = (lb+ub)/2;
            if(year[cb] <  y)
            lb = cb + 1;
            else if(year[cb] > y)
            ub = cb - 1;
            else
            {
                p = cb;
                break;
            }
        }
        if(p>= 0)
        System.out.println("Record exists");
        else
        System.out.println("Record does not exist");
        sc.close();
    }
}
