package class10.chapter1;
import java.util.Scanner;
class c10_diceGuess
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=(int) (Math.random()*6+1);
        System.out.print("Guess a number between 1 and 6:");
        int guess=sc.nextInt();
        if(n==guess)
            System.out.print("You win!");
        else
            System.out.print("Sorry! The number was "+n);
    }
}