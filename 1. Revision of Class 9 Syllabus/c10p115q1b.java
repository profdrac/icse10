package class10.chapter1;
/**
 * WAP to display the first ten term of the series
 * 1, -3, 5, -7, 9-----
 * @author (Ashutosh Sharma)
 */
class c10p115q1b
{
    public static void main(String[] args)
    {
        int x=0;
        for(int i=1;i<=19;i=i+2)
        {
            if(x==0)
            {
                System.out.print(i+" ");
                x=1;
            }
            else
            {
                System.out.print(-i+" ");
                x=0;
            }
        }

    }   
}