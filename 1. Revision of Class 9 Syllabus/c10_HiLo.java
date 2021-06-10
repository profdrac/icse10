package class10.chapter1;
/*WAP to make a guessing-game. User keeps guessing a number
unti he gets the correct number generated. Modify the program
for unlimited games.
Ashutosh Sharma@OLS-28042020
*/
import java.util.Scanner;
class c10_HiLo
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int again=0;
        do
        {
            int n=(int) (Math.random()*100+1);
            int guess=0;
            while(guess!=n)
            {
                System.out.print("Guess a number between 1 and 100:");
                guess=sc.nextInt();
                if(guess<n)
                    System.out.println(guess+" is too low. Try again!");
                else if(guess>n)
                    System.out.println(guess+" is too high. Try again!");
                else
                    System.out.println("You Win!");
            }
            System.out.print("Play again? 1 to Play/0 to Exit: ");
            again=sc.nextInt();
        }while(again!=0);
    }
}