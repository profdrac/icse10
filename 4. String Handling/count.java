package class10.chapter4;
import java.util.Scanner;
class count
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=sc.nextLine();
		s = s.toLowerCase();
		int l=s.length();
		int cc=0, cv=0, cs=0;
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				cv++;
			else if(ch==' ')
				cs++;
			else
				cc++;
		}
		System.out.println("Vowels are "+cv);
		System.out.println("Spaces are "+cs);
		System.out.println("Consonants are "+cc);
		System.out.println("Words are "+(cs+1));
		sc.close();
	}
}
