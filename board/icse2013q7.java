import java.util.Scanner;

/*
Question 7:
Write a program to input 10 integer elements in an array and sort them in descending order using the bubble sort technique.
*/

public class icse2013q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            //n[i] = sc.nextInt();
            
            //Automating a bit to check output
            n[i] = (int) (Math.random()*100)+1;
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length-1; j++) {
                if(n[j] < n[j+1])
                {
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted numbers are:");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+", ");
        }
        sc.close();
    }
}
