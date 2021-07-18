/*
 *Question 7.

Design a class to overload a function volume() as follows:

(i) double volume (double R) — with radius (R) as an argument, returns the volume of sphere using the formula.
V = 4/3 × 22/7 × R3

(ii) double volume (double H, double R) – with height(H) and radius(R) as the arguments, returns the volume of a cylinder using the formula.
V = 22/7 × R2 × H

(iii) double volume (double L, double B, double H) – with length(L), breadth(B) and Height(H) as the arguments, returns the volume of a cuboid using the formula*/

class icse2018q7
{
    public double volume(double r)
    {
        double vol = 0.33*3.14*r*r*r;
        return vol;
    }
    
    
    public double volume(double h, double r)
    {
        double vol = 3.14*r*r*h;
        return vol;
    }
    
    public double volume(double l, double b, double h)
    {
        double vol = l*b*h;
        return vol;
    }
    
    public static void main(String args[])
    {
        icse2018q7 o = new icse2018q7();
        System.out.println("Volume of sphere is "+o.volume(12.73));
        System.out.println("Volume of cylinder is "+o.volume(15,6.1));
        System.out.println("Volume of cuboid is "+o.volume(10,11,12));
    }
}
