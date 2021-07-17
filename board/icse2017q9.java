import java.util.Scanner;

/*
Question 9.

Write a program to input forty words in an array. Arrange these words in descending order
of alphabets, using selection sort technique. Print the sorted array
*/

class icse2017q9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n[] = new String[40];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Enter word number "+(i+1)+": ");
            n[i] = sc.next();
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length -1 ; j++) {
                if(n[i].compareTo(n[j])>0)
                {
                    String temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.println("After sorting:");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        sc.close();
    }
}
