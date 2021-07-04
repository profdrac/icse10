package board;

import java.util.Scanner;

/*
Write a program to store 6 elements in any array P, and 4 elements in an array Q
and produce a third array R, containing all the elements of array P and Q.
Display the resultant array.
*/

public class icse2010q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P[] = new int[6];
        int Q[] = new int[4];
        int R[] = new int[10];
        System.out.print("Enter 6 numbers of P: ");
        for (int i = 0; i < P.length; i++) {
            P[i] = sc.nextInt();
        }
        System.out.print("Enter 4 numbers of P: ");
        for (int i = 0; i < Q.length; i++) {
            Q[i] = sc.nextInt();
        }
        for (int i = 0; i < R.length; i++) {
            if(i<6)
            R[i] = P[i];
            else
            R[i] = Q[i-6];
        }
        System.out.println("Numbers in R are:");
        for (int i = 0; i < R.length; i++) {
            System.out.print(R[i] + " ");
        }
        sc.close();
    }
}
