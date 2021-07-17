/*
Question 8.

Design a class to overload a function check ( ) as follows :

(i) void check (String str, char ch) – to find and print the frequency
of a character in a string.

Example :
Input:
str = “success”
ch = ‘s’ .
Output:
number of s present is = 3

(ii) void check(String si) – to display only vowels from string si,
after converting it to lower case.

Example:
Input:
s1 = “computer”
Output:
o u e

@author: Ashutosh Sharma
*/

class icse2017q8 {
	
	private void check(String str, char ch)
	{
		int count = 0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ch)
				count++;
		}
		System.out.println(ch+" occurs "+count+" times");
	}

	private void check(String si)
	{
		si = si.toLowerCase();
		for(int i=0; i<si.length(); i++)
		{
			char ch = si.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println(ch);
		}	
	}

	public static void main(String args[]) {
		icse2017q8 o = new icse2017q8();
		o.check("hello", 'l');
		o.check("amazonia");
	}
}
