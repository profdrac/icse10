package class10.chapter6;
/**
 * c10p355q1
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class Calculate
{
    int a, b;
    int sum, diff;
    
    public void inputdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values of a and b:");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
    }
    
    public void calculate()
    {
        sum=a+b;
        diff=a-b;
    }
    
    public void outputdata()
    {
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+diff);
    }
    
    public static void main(String[] args)
    {
        Calculate o = new Calculate();
        o.inputdata();
        o.calculate();
        o.outputdata();
    }   
}