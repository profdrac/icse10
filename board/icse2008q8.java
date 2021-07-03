package board;

/*
Question 8:
Write a class with the name volume using function overloading that computes the volume of a cube, a sphere and a cuboid.
Formula
volume of a cube (vc) = s*s*s
volume of a sphere (vs) = 4/3* π* r* r*r (where π = 3.14 or 22/7)
Volume of a cuboid (vcd) = l* b* h
*/

public class icse2008q8 {
    private void volume(int s)
    {
        System.out.println("Volume of cube is "+s*s*s);
    }

    private void volume(double r)
    {
        System.out.println("Volume of sphere is " + (4.0/3.0)*3.14*r*r*r);
    }

    private void volume(int l, int b, int h)
    {
        System.out.println("Volume of cuboid is "+l*b*h);
    }

    public static void main(String[] args) {
        icse2008q8 o = new icse2008q8();
        o.volume(4);
        o.volume(4.5);
        o.volume(1,2,3);
    }
}
