/*
Question 5:
Write two separate programs to generate the following patterns using iteration (loop)

(a)	*
	* #
	* # *
	* # * #
	* # * # *

(b)	5 4 3 2 1
	5 4 3 2
	5 4 3
	5 4
	5
*/

class icse2015q5_2 {
	public static void main(String args[]) {
		for(int i = 1; i<=5; i++) {
			for(int j = 5; j>=i; j--)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
