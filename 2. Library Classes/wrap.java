package class10.chapter2;
class wrap
{
    public static void main(String[] args)
    {
        String a = "162.07";
        //double b = Double.parseDouble(a);
        double b = Double.valueOf(a);
        b++;
        System.out.println(b);
        b--;
        String c = Double.toString(b);
        System.out.println(c);
    }   
}