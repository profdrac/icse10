/*
Challenge #393 [Easy] Making change

The country of Examplania has coins that are worth 1, 5, 10, 25, 100, and 500 currency units. At the
Zeroth Bank of Examplania, you are trained to make various amounts of money by using as many 
¤500 coins as possible, then as many ¤100 coins as possible, and so on down.
For instance, if you want to give someone ¤468, you would give them four ¤100 coins, two ¤25 
coins, one ¤10 coin, one ¤5 coin, and three ¤1 coins, for a total of 11 coins.
Write a function to return the number of coins you use to make a given amount of change.

change(0) => 0
change(12) => 3
change(468) => 11
change(123456) => 25
*/
import java.util.Scanner;

class Challenge393
{
    public int change(long amount)
    {
        int coins = 0;
        coins += amount/500;
        amount %= 500;
        coins += amount/100;
        amount %= 100;
        coins += amount/25;
        amount %= 25;
        coins += amount/10;
        amount %= 10;
        coins += amount/5;
        amount %= 5;
        coins += amount/1;
        return coins;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Challenge393 o = new Challenge393();
        System.out.print("What is the amount for which you want to get change? ");
        long amount = sc.nextLong();
        int number_of_coins = o.change(amount);
        System.out.println(number_of_coins);
        sc.close();
    }
}