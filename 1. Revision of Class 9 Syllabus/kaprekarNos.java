package class10.chapter1;
class kaprekarNos
{
	public static void main(String args[])
	{
		for(int i=1;i<=1000;i++)
		{
			int n = i;
			int t = n;
			int sq = n*n;
			int hl = 0, hr = 0, sum = 0, cd = 0;
			while(n>0){
				cd++;
				n=n/10;
			}
			hr = sq % (int) Math.pow(10, cd);
			hl = sq / (int) Math.pow(10, cd);
			if(t == hl+hr)
				System.out.println(i+"\t"+sq+"\t"+hl+" + "+hr);
		}
	}
}