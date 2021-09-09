package class10.chapter2;

class charFun
{
    public static void main()
    {
        //checking
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('?'));
        System.out.println(Character.isLetterOrDigit('?'));
        System.out.println(Character.isLetterOrDigit('6'));
        System.out.println(Character.isLetterOrDigit('p'));
        System.out.println(Character.isWhitespace('p'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('Z'));
        //conversion
        char ch='d';
        char ch2 = Character.toUpperCase(ch);
        System.out.println(ch+" becomes "+ch2);
        char ch3 = Character.toLowerCase('G');
        System.out.println("G becomes "+ch3);
    }   
}