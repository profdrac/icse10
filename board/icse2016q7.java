/*
Question 7:
Design n class to overload a function SumSeriesO as follows:

(i) void SumSeries(int n, double x) – with one integer argument and one double argument to find and display
the sum of the series given below:
s = x/1 - x/2 + x/3 ----------- to n terms

(ii) void SumSeries() – To find and display the sum of the following series:
s = 1 + (1 x 2) + (1 x 2 x 3) + ….. + (1 x 2 x 3 x 4 x 20)
*/

import java.util.Scanner;

class icse2016q7
{
	private void SumSeries(int n, double x)
	{
		double s = 0;
		int flag = 1;
		for(int i=1; i<=n; i++)
		{
			s += (double) (x/i)*flag;
			flag *= -1;
		}
		System.out.println("Sum of series is "+s);
	}

	private void SumSeries()
	{
		long sum = 0;
		for(int i=20; i>0; i--)
		{
			int fact = 1;
			for(int j=i; j>0; j--)
				fact *= j;
			sum += fact;
		}
		System.out.println("Sum of series is "+sum);
	}

	public static void main(String args[])
	{
		icse2016q7 o = new icse2016q7();
		o.SumSeries(5, 2);
		o.SumSeries();
	}
}
