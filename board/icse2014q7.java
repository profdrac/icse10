/*
Question 7:
Design a class to overload a function area( ) as follows:

(i) double area (double a, double b, double c) with three double arguments, returns the area of a scalene triangle using the formula:
area = √ s(s−a)(s−b)(s−c)2ab
where s=(a+b+c)2

(ii) double area (int a, int b, int height) with three integer arguments, returns the area of a trapezium using the formula:
area = 1/2height(a + b)

(iii) double area (double diagonal 1, double diagonal 2) with two double arguments, returns the area of a rhombus using the formula :
area = 1/2(diagonal 1 x diagonal 2)
*/

public class icse2014q7 {
    
    private double area(double a, double b, double c)
    {
        double s = (a+b+c)/2;
        double res = Math.sqrt(s*(s-a)*(s-b)*(s-c)*2*a*b);
        return res;
    }

    private double area(int a, int b, int height)
    {
        double res = 1.0/2.0*height*(a+b);
        return res;
    }

    private double area(double diagonal1, double diagonal2)
    {
        double res = 1.0/2.0*(diagonal1*diagonal2);
        return res;
    }

    public static void main(String[] args) {
        icse2014q7 o = new icse2014q7();
        System.out.println(o.area(10, 12.5, 13.1));
        System.out.println(o.area(8, 10, 6));
        System.out.println(o.area(12.5, 13.5));
    }
}
