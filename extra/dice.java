/*
Revision Test (01-07-2021 Question 4)

WAP to create a class named dice and create a function named throw_dice() in it. The 
function generates a number between 1-6 and returns it back. If we get an even number 
on throwing the dice we win and if we get an odd number we lose. Show the result of 
throwing the dice accordingly.

*We do not ask a number while playing. We get a random number every time we throw dice
*/

class dice 
{
    public int throw_dice()
    {
        int number = (int) (Math.random()*6)+1;
        return number;
    }

    public static void main(String[] args) 
    {
        dice o = new dice();
        System.out.println("Throwing dice...");
        int n = o.throw_dice();
        if(n%2 == 0)
        System.out.println("We got even number "+n+" and we won!");
        else
        System.out.println("We got odd number "+n+" and we lose!");
    }
}
