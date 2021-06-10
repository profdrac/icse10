package class10.chapter1;
/**
 * WAP to display the first ten term of the series
 * 1, 12, 123, 1234----------
 * @author (Ashutosh Sharma)
 */
class c10p115q1e
{
    public static void main(String[] args)
    {
        int s=0;
        for(int i=1;i<=10;i++)
        {
            s=s*10+i;
            System.out.print(s+" ");
        }
    }   
}