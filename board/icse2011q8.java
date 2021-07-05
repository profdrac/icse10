package board;

/*
Question 8:
Design a class to overload a function compared as follows :

(a) void compare(int, int) — to compare two integer values and print the greater of the two integers.
(b) void compare(char, char) — to compare the numeric value of two characters and print the character with higher numeric value.
(c) void compare(String, String) — to compare the length of the two strings and print the longer of the two.
*/

public class icse2011q8 {
    
    private void compare(int a, int b)
    {
        System.out.println("Greater number is "+Math.max(a, b));
    }

    private void compare(char a, char b)
    {
        System.out.println("Greater alphabet is "+(char) Math.max(a, b));
    }

    private void compare(String a, String b)
    {
        if(a.length() > b.length())
        System.out.println(a+ " is longer");
        else if(a.length() < b.length())
        System.out.println(b+ " is longer");
        else
        System.out.println("Length of " + a + " and " + b + " is same");
    }

    public static void main(String[] args) {
        icse2011q8 o = new icse2011q8();
        o.compare(10, 20);
        o.compare('M', 'J');
        o.compare("OLS", "SCHOOL");
    }
}
