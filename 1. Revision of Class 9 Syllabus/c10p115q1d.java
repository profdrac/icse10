package class10.chapter1;
/**
 * WAP to display the first ten term of the series
 * 1, 11, 111, 1111----------
 * @author (Ashutosh Sharma)
 */
class c10p115q1d
{
    public static void main(String[] args)
    {
        int n=0;
        for(int i=1;i<=10;i++)
        {
            n=n*10+1;
            System.out.print(n+" ");
        }
    }   
}