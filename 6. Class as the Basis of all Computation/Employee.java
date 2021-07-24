package class10.chapter6;
/**
 * c10p355q3
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class Employee
{
    int pan;
    String name;
    double taxincome, tax;
    
    private void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        name=sc.nextLine();
        System.out.print("Enter pan-number:");
        pan=sc.nextInt();
        System.out.print("Enter taxable income:");
        taxincome=sc.nextDouble();
        sc.close();
    }
    
    private void cal()
    {
        if(taxincome<=250000)
            tax=0;
        else if(taxincome>250000 && taxincome<=500000)
            tax=(taxincome-250000)*10/100;
        else if(taxincome>500000 && taxincome<=1000000)
            tax=30000+(taxincome-500000)*20/100;
        else
            tax=50000+(taxincome-1000000)*30/100;
    }
    
    private void display()
    {
        System.out.println("PAN\tName\tIncome\tTax");
        System.out.println(pan+"\t"+name+"\t"+taxincome+"\t"+tax);
    }
    
    public static void main(String[] args)
    {
        Employee o = new Employee();
        o.input();
        o.cal();
        o.display();
    }   
}