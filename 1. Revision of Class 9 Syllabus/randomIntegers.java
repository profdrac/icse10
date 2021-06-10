package class10.chapter1;
import java.util.Scanner;
class randomIntegers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers to generate? ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print((int) (Math.random()*n+1)+" ");
		}
		sc.close();
	}
}