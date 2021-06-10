package class10.chapter1;
class narcissisticNos
{
	public static void main(String args[])
	{
		int count = 0;
		int n = 0;
		do
		{
			int t = n;
			int cd = 0;
			while(t>0){
				cd++;
				t = t/10;
			}
			t = n;
			int sum = 0;
			while(t>0){
				int rem = t%10;
				sum = sum + (int) Math.pow(rem, cd);
				t = t/10;
			}
			if(sum == n){
				System.out.print(n+" ");
				count++;
			}
			n++;
		}while(count<15);
	}
}