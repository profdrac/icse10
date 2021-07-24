package class10.chapter6;
/**
 * Pythagorean Triplets e.g. 3,4,5
 * c10p355q2
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class Triplet
{
    int a, b, c;
    
    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();
    }
    
    public void findprint()
    {
        if(a*a==b*b+c*c || b*b==c*c+a*a || c*c==a*a+b*b)
            System.out.println("Pythagorean Triplets");
        else
            System.out.println("!Pythagorean Triplets");
    }
    
    public static void main(String[] args)
    {
        Triplet o = new Triplet();
        o.getdata();
        o.findprint();
    }   
}