package class10.chapter4;
//WAP to show all alphabets of English on screen along with their ASCII codes

class alphabets
{
    public static void main()
    {
        for(int i = 65; i <= 90; i++)
        {
            System.out.println((char)i + " = " + i);
            System.out.println((char) (i+32) + " = " + (i+32));
        }
    }
}