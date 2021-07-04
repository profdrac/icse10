package board;

import java.util.Scanner;

/*
Question 5:
Define a class student described as below:

Data members/instance variables:
--------------------------------
name, age, m1, m2, m3 (marks in 3 subjects), maximum, average 

Member methods
--------------
(i) A parameterized constructor to initialize the data members
(ii) To accept the details of a student
(iii) To compute the average and the maximum out of three marks
(iv) To display the name, age, marks in three subjects, maximum and average.

Write a main method to create an object of a class and call the above member methods.
*/

public class icse2010q5 {
    
    String name;
    int age, m1, m2, m3, maximum;
    double average;

    icse2010q5(String n, int a, int mx1, int mx2, int mx3)
    {
        name = n;
        age = a;
        m1 = mx1;
        m2 = mx2;
        m3 = mx3;
    }

    private void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in three subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        sc.close();
    }

    private void compute()
    {
        maximum = Math.max(m1, Math.max(m2, m3));
        average = (m1+m2+m3)/3;
    }

    private void display()
    {
        System.out.println("Maximum marks are " + maximum);
        System.out.println("Average marks are " + average);
    }
    
    public static void main(String[] args) {
        icse2010q5 o = new icse2010q5("John Keats", 24, 0, 0, 0);
        o.input();
        o.compute();
        o.display();
    }    
}
