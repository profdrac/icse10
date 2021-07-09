/*
Question 7:
Design a class to overload a function Joystring( ) as follows :

(i) void Joystring (String s, char ch1 char ch2) with one string argument and two character arguments that replaces the character argument ch1 with the character argument ch2 in the given string s and prints the new string.

Example:
Input value of s = “TECHNALAGY”
ch1=‘A’,
ch2=‘O’
Output: TECHNOLOGY

(ii) void Joystring (String s) with one string argument that prints the position of the first space and the last space of the given string s.

Example:
Input value of = “Cloud computing means Internet based computing”
Output: First index : 5
Last index : 36

(iii) void Joystring (String s1, String s2) with two string arguments that combines the two string with a space between them and prints the resultant string. Example :
Input value of s1 =“COMMON WEALTH”
Input value of s2 =“GAMES”
Output: COMMON WEALTH GAMES
(use library functions)
*/

class icse2015q7 {
	
	private void joystring(String s, char ch1, char ch2) {
		System.out.println(s.replace(ch1, ch2));
	}

	private void joystring(String s) {
		System.out.println("First space is at "+s.indexOf(" "));
		System.out.println("Last space is at "+s.lastIndexOf(" "));
	}

	private void joystring(String s1, String s2) {
		System.out.println(s1.concat(" "+s2));
	}

	public static void main(String args[]) {
		icse2015q7 o = new icse2015q7();
		o.joystring("cool", 'c', 'f');
		o.joystring("OLS School Kullu");
		o.joystring("Hello","Programmer");
	}
}
