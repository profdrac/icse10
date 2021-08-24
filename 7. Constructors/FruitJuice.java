package class10.chapter7;
import java.util.Scanner;
class FruitJuice
{
	int product_code, pack_size, product_price;
	String flavour, pack_type;

	FruitJuice()
	{
		product_code=0;
		pack_size=0;
		product_price=0;
		flavour="";
		pack_type="";
	}

	private void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter product code:");
		product_code=sc.nextInt();		
		System.out.print("Enter pack-type");
		pack_type=sc.next();
		System.out.print("Enter pack size:");
		pack_size=sc.nextInt();
		System.out.print("Enter price:");
		product_price=sc.nextInt();
		System.out.print("Enter flavour:");
		flavour=sc.next();
		sc.close();
	}

	private void discount()
	{
		product_price-=10;
	}

	private void display()
	{
		System.out.println("Product Code: "+product_code);
		System.out.println("Price: "+product_price);
	}

	public static void main(String args[])
	{
		FruitJuice o=new FruitJuice();
		o.input();
		o.discount();
		o.display();
	}
}
