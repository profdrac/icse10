package board;

/*
Question 7:
Design a class to overload a function num_calc() as follows :

(a) void num_calc (int num, char ch) with one integer argument and one character argument, 
computes the square of integer argument if choice ch is ‘s’ otherwise finds its cube.

(b) void num_calc (int a, int b, char ch) with two integer arguments and one character argument.
It computes the product of integer arguments if ch is ‘p’ else adds the integers.

(c) void num_calc (String s1, String s2) with two string arguments, which prints whether the strings
are equal or not
*/

public class icse2009q7 {
    private void num_calc(int num, char ch)
    {
        int result = ch == 's' ? num*num : num*num*num;
        System.out.println(result);
    }

    private void num_calc(int a, int b, char ch)
    {
        int result = ch == 'p' ? a*b : a+b;
        System.out.println(result);
    }

    private void num_calc(String s1, String s2)
    {
        boolean result = s1.equalsIgnoreCase(s2);
        if(result)
        System.out.println("Strings are equal");
        else
        System.out.println("Strings are not equal");
    }

    public static void main(String[] args) {
        icse2009q7 o = new icse2009q7();
        o.num_calc(123, 's');
        o.num_calc(10, 10, 'x');
        o.num_calc("Hello", "World");
    }
}
