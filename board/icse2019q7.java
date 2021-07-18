/*
 *Question 7.
Design a class to overload a function series() as follows:

(a) void series (int x, int n) – To display the sum of the series given below:
x1 + x2 + x3 + ……………. xn terms

(b) void series (int p) – To display the following series:
0, 7, 26, 63 p terms.

(c) void series () – To display the sum of the series given below:
1/2 + 1/3 + ---- + 1/10

 * @author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2019q7 {
	
    private void series(int x, int n)
    {
        int sum = 0;
        for(int i=1; i<=n; i++)
            sum += (int) Math.pow(x, i);
        System.out.println("Sum is "+sum);
    }

    private void series(int p)
    {
        for(int i=1; i<p; i++)
        {
            int val = (i*i*i)-1;
            if(val>p)
                break;
	    System.out.print(val + " ");
        }
	System.out.println();
    }

    private void series()
    {
        double sum = 0;
        for(int i=1; i<=10; i++)
            sum += (double) (1/i);
        System.out.println("Sum is "+sum);
    }

	public static void main(String args[]) {
        icse2019q7 o = new icse2019q7();
        o.series(2, 5);
        o.series(100);
        o.series();
	}
}
