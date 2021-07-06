import java.util.Scanner;

/*
Question 6:
Write a program that encodes a word into Piglatin.
To translate word into a Piglatin word, convert the word into uppercase and then
place the first vowel of the original word as the start of the new word along with
the remaining alphabets. The alphabets present before the vowel
being shifted towards the end followed by “AY”.

Sample input (1) : London, Sample output (1) : ONDONLAY
Sample input (2) : Olympics, Sample output (2) : OLYMPICSAY
*/

public class icse2013q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next();
        s = s.toUpperCase();
        int l = s.length();
        String pig = "";
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U')
            {
                pig = s.substring(i) + s.substring(0, i);
                break;
            }
        }
        if(pig.length() == 0)
        pig = s;
        pig += "AY";
        System.out.println("Piglatin of " + s + " is " + pig);
        sc.close();
    }
}
