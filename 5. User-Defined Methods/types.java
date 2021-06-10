package class10.chapter5;

class types
{
    public void callme1()
    {
        System.out.println("Hello, I do not return anything");
    }
    
    public void callme2(String s)
    {
        System.out.println("Hello, I get a value but does not return anything");
        System.out.println("You gave me "+s);
    }
    
    public int callme3(int n)
    {
        return n*n;
    }
    
    public static void main(String args[])
    {
        types o = new types();
        o.callme1();
        o.callme2("My name is Ashutosh");
        System.out.println(o.callme3(12));
    }
}
        