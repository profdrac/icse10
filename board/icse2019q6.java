/*
 *Question 6.
Write a program to input 15 integer elements in an array and sort them in ascending order using the bubble sort technique.

* @author: Ashutosh Sharma
*/

import java.util.Scanner;

public class icse2019q6 {
    public static void main(String[] args) {
        int n[] = new int[15];
        for(int i=0; i<n.length; i++)
            n[i] = (int) (Math.random()*100)+1;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length-1; j++) {
                if(n[j] > n[j+1])
                {
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting n is: ");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }    
}
