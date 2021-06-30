public class revision30062021_5
{
    public void convert(int seconds)
    {
        int h = seconds/3600;
        seconds %= 3600;
        int m = seconds/60;
        seconds %= 60;
        System.out.println(h+" hours "+m+" minutes "+seconds+" seconds");
    }

    public void convert(double days)
    {
        int dz = (int) days;
        int y = dz/365;
        dz %= 365;
        int m = dz/60;
        dz %= 30;
        System.out.println(y+" years "+m+" months "+dz+" days");
    }
    
    public static void main(String[] args) {
        revision30062021_5 o = new revision30062021_5();
        o.convert(4000);
        o.convert(400.0);
    }
}
