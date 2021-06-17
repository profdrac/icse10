package class10.chapter5;
/**
 * WAP to overload fun series()
 * @author (Ashutosh Sharma)
 */
class c10p314q23
{
    public double series(double n)
    {
        double s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+(double) (1/i);
        }
        return s;
    }
    
    public double series(double a, double n)
    {
        double s=0;
        for(int i=1;i<=n;i=i+3)
        {
            s=s+(double) (i/Math.pow(a,i+1));
        }
        return s;
    }
    
    public static void main(String[] args)
    {
        c10p314q23 o=new c10p314q23();
        double sum1=o.series(12);
        double sum2=o.series(3,10);
        System.out.println("Sum of first series is "+sum1);
        System.out.println("Sum of second series is "+sum2);
    }   
}