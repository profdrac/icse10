package class10.chapter7;

class sum
{
    int a,b;
    
    sum()
    {
        a=10;
        b=20;
    }
    
    public void showResult()
    {
        System.out.println("Sum is "+(a+b));
    }
    
    public static void main()
    {
        sum o = new sum();
        o.showResult();
    }
}