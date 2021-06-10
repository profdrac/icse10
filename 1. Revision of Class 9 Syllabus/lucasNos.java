package class10.chapter1;
class lucasNos
{
	public static void main(String args[])
	{
		int a = 2, b = 1;
		System.out.println(a+"\n"+b);
		for(int i=0;i<8;i++){
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}