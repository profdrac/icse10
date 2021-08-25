package class10.chapter7;

class Calculate
{
    int num, f, rev;

    Calculate(int n)
    {
        num = n;
        f = 0;
        rev = 0;
    }

    private int prime()
    {
        int c = 0;
        for(int i = 2;i<num;i++)
        {
            if(num%i==0)
                c++;
        }
        if(c==0)
            return(1);
        else
            return(0);
    }

    private int reverse()
    {
        int n = num;
        while(n>0)
        {
            rev = rev*10+n%10;
            n/=10;
        }
        return(rev);
    }

    private void display()
    {
        if(this.prime()==1 && this.reverse()==this.num)
            System.out.println("Prime Palindrome");
        else
            System.out.println("Not Prime Palindrome");
    }

    public static void main(String args[])
    {
        Calculate o = new Calculate(101);
        o.display();
    }
}
