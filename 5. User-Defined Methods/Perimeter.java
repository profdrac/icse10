package class10.chapter5;

//Page 313 Question 16
class Perimeter
{
    public void getperi(int s)
    {
        System.out.println("Perimeter of square is "+4*s);
    }
    
    public void getperi(int l,int b)
    {
        System.out.println("Perimeter of rectangle is "+2*(l+b));
    }
    
    public void getperi(double r)
    {
        System.out.println("Perimeter of circle is "+2*3.14*r);
    }
    
    public static void main()
    {
        Perimeter o = new Perimeter();
        o.getperi(4);
        o.getperi(15, 16);
        o.getperi(4.3);
    }
}