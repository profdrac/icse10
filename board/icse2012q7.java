package board;

/*
Question 7:
Design a class to overload a function polygon() as follows

(i) void polygon(int n, char ch) — with one integer argument and one character type argument
that draws a filled square of side n using the character stored in ch.

(ii) void polygon(int x, int y) — with two integer arguments that draws a filled rectangle
of length x and breadth y, using the symbol ‘@’.

(iii) void polygon( ) — with no argument that draws a filled an triangle shown below.
*
* *
* * *

*/

public class icse2012q7 {
    
    private void polygon(int n, char ch)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    private void polygon(int x, int y)
    {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }

    private void polygon()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        icse2012q7 o = new icse2012q7();
        o.polygon(5, '#');
        o.polygon(4, 3);
        o.polygon();
    }
}
