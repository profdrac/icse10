package class10.chapter7;
class Quad 
{
    double a, b, c, d, r1, r2;

    Quad(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
        d = 0;
    }

    private void calculate()
    {
        d = b*b-4*a*c;
        if(d<0)
            System.out.println("Roots not possible");
        else
        {
            r1 = (-b+Math.sqrt(d))/2*a;    
            r2 = (-b-Math.sqrt(d))/2*a;
            System.out.println("r1 = "+r1+"\tr2 = "+r2);
        }
    }

    public static void main(String args[])
    {
        Quad o = new Quad(2, 3, 4);
        o.calculate();
    }
}
