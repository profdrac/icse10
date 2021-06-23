/*
WAP to overload a function named area() to compute area of a circle, parallelogram and 
rectangle.
Area of circle = 𝜋𝑟^2
Area of parallelogram = base * height
Ares of rectangle = length * breadth
Create main() method to call those functions/methods one-by-one.
 */
class revision23062021_5
{
    public void area(int r)
    {
        System.out.println("Area of circle = "+3.14*r*r);
    }
    
    public void area(int base, int height)
    {
        System.out.println("Area of parallelogram = "+base*height);
    }
    
    public void area(double length, double breadth)
    {
        System.out.println("Area of rectangle = "+length*breadth);
    }
    
    public static void main(String []args)
    {
        revision23062021_5 o = new revision23062021_5();
        o.area(7);
        o.area(12, 16);
        o.area(4.65, 5.72);
    }
}