package class10.chapter5;

//Implement Scanner for input if you want

class p315q27
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
    
    public static void main()
    {
        p315q27 o = new p315q27();
        System.out.println("Volume of sphere is "+o.volume(12.73));
        System.out.println("Volume of cylinder is "+o.volume(15,6.1));
        System.out.println("Volume of cuboid is "+o.volume(10,11,12));
    }
}