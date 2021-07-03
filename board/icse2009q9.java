package board;

import java.util.Scanner;

/*
Question 9:
The annual examination results of 50 students in a class is tabulated as follows :
Roll No     Subject A       Subject B       Suject C
------      ---------       ---------       --------
Write a program to read the data, calculate and display the following :

(a) Average marks obtained by each student.
(b) Print the roll number and average marks of the students whose average mark is above 80.
(c) Print the roll number and average marks of the students whose average mark is below 40
*/

public class icse2009q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rn[] = new int[50];
        int s1[] = new int[50];
        int s2[] = new int[50];
        int s3[] = new int[50];

        for (int i = 0; i < rn.length; i++) {
            System.out.print("Enter roll-number and marks in 3 subjects for student number "+(i+1)+": ");
            /*
            rn[i] = sc.nextInt();
            s1[i] = sc.nextInt();
            s2[i] = sc.nextInt();
            s3[i] = sc.nextInt();
            */
            //Automating a little so that we dont have to enter data for 50 students
            rn[i] = i+1;
            s1[i] = (int) (Math.random()*100)+1;
            s2[i] = (int) (Math.random()*100)+1;
            s3[i] = (int) (Math.random()*100)+1;
            System.out.println("...done");
        }
        for (int i = 0; i < s3.length; i++) {
            int avg = (s1[i]+s2[i]+s3[i])/3;
            System.out.println("Average marks of student "+(i+1)+" are "+avg);
        }
        for (int i = 0; i < s3.length; i++) {
            int avg = (s1[i]+s2[i]+s3[i])/3;
            if(avg>80)
            System.out.println("Roll-number "+rn[i]+" has average marks "+avg);
        }
        for (int i = 0; i < s3.length; i++) {
            int avg = (s1[i]+s2[i]+s3[i])/3;
            if(avg<40)
            System.out.println("Roll-number "+rn[i]+" has average marks "+avg);
        }
        sc.close();
    }    
}
