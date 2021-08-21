package class10.chapter7;
//p388q1
import java.util.Scanner;

class Hcflcm 
{
    int a, b;

    Hcflcm(int x, int y)
    {
        a = x;
        b = y;
    }

    private void calculate()
    {
        int hcf = 1, lcm;
        for(int i = 1;i<=Math.min(a, b);i++)
        {
            if(a%i==0 && b%i==0)
                hcf = i;
        }
        lcm = a*b / hcf;
        System.out.println("HCF of "+a+" and "+b+" is "+hcf);    
        System.out.println("LCM of "+a+" and "+b+" is "+lcm);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 numbers:");
        int fn=sc.nextInt();
        int sn=sc.nextInt();
        Hcflcm o = new Hcflcm(fn, sn);
        o.calculate();
        sc.close();
    }
}
