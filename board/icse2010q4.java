package board;

import java.util.Scanner;

/*
Question 4:
Write a program to perform binary search on a list of integers given below,
to search for an element input by the user, if it is found display the element
along with its position, otherwise display the message “Search element not found”.

5, 7, 9, 11, 15, 20, 30, 45, 89, 97
*/

public class icse2010q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = {5, 7, 9, 11, 15, 20, 30, 45, 89, 97};
        System.out.print("Enter number to be searched: ");
        int x = sc.nextInt();
        int lb = 0, ub = n.length;
        int pos = -1;
        while(lb<ub)
        {
            int cb = (lb + ub) / 2;
            if(n[cb] < x)
            lb = cb + 1;
            else if (n[cb] > x)
            ub = cb - 1;
            else
            {
                pos = cb;
                break;
            }
        }
        if(pos>=0)
        System.out.println("Number found at position "+pos);
        else
        System.out.println("Search element not found");
        sc.close();
    }
}
