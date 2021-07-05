package board;

import java.util.Scanner;

/*
Question 5:
Write a program to input and store the weight of ten people.
Sort and display them in descending order using the selection sort technique.
*/

public class icse2011q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight[] = new int[10];
        for (int i = 0; i < weight.length; i++) {
            System.out.print("Enter weight of person number " + (i+1) + ": ");
            weight[i] = sc.nextInt();
        }
        System.out.println("Unsorted weights are:");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]+" ");
        }
        for (int i = 0; i < weight.length; i++) {
            for (int j = i; j < weight.length; j++) {
                if(weight[i] > weight[j])
                {
                    int temp = weight[i];
                    weight[i] = weight[j];
                    weight[j] = temp;
                }
            }
        }
        System.out.println("\nSorted weights are:");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]+" ");
        }
        sc.close();
    }
}
