package board;
/*
Question 6:
Write a program to initialize the given data in an array and find the minimum ; and maximum values along with the sum of the given elements.
Numbers : 2 5 4 1 3
Output :
Minimum value : 1
Maximum value: 5
Sum of the elements : 15 
*/
public class icse2007q6 {
    public static void main(String[] args) {
        int n[] = {2, 5, 4, 1, 3};
        int max = n[0], min = n[0], sum = 0;
        for (int i = 0; i < n.length; i++) {
            if(n[i] < min)
            min = n[i];
            if(n[i] > max)
            max = n[i];
            sum += n[i];
        }
        System.out.println("Minimum is "+min);
        System.out.println("Maximum is "+max);
        System.out.println("Sum is "+sum);
    }
}
