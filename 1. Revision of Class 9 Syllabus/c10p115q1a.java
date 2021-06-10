package class10.chapter1;
/**
 * WAP to display the first ten term of the series
 * 0, 1, 2, 3, 6----- (tribonacci-series)
 * @author (Ashutosh Sharma)
 */
class c10p115q1a
{
    public static void main(String[] args)
    {
        int a=0,b=1,c=2;
        System.out.print("0 1 2 ");
        for(int i=0;i<7;i++)
        {
            int d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }   
}