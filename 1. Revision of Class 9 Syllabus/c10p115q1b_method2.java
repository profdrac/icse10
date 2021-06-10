package class10.chapter1;
/**
 * WAP to display the first ten term of the series
 * 1, -3, 5, -7, 9-----
 * @author (Ashutosh Sharma)
 */
class c10p115q1b_method2
{
    public static void main(String[] args)
    {
        int x=-1;
        for(int i=1;i<=19;i+=2)
        {
            x=x*-1;
            System.out.print(i*x+" ");
        }

    }   
}