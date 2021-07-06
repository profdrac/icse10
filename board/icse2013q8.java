/*
Design a class to overload a function series ( ) as follows :

(i) double series (double n) with one double argument and returns the sum of the series
sum = 1/1 + 1/2 + ----- + 1/n

(ii) double series (double a, double n) with two double arguments and returns the sum of the series
sum = 1/a^2 + 4/a^5 + 7/a^8 + ----- + n
*/

public class icse2013q8 {

    private void series(double n)
    {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (double) (1/i);
        System.out.println("Sum of series is " + sum);
    }
    
    private void series(double a, double n)
    {
        double sum = 0;
        for (int i = 1; i <= n; i+=3)
            sum += (double) (i/(Math.pow(a, i+1)));
        System.out.println("Sum of series is " + sum);
    }

    public static void main(String[] args) {
        icse2013q8 o = new icse2013q8();
        o.series(17);
        o.series(3, 4);
    }
}
