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

class icse2015q5_1 {
	public static void main(String args[]) {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<=i; j++) {
				if(j%2 == 0)
					System.out.print("* ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}
}
