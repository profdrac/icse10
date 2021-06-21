/*
Challenge # 246
You are working with Microsoft to help them release Windows 11. 
They are making an updated calculator which lets users check a number for special properties.
They don't have any programmer good with maths and are seeking your help.
They want you to create a function named check() with the given format

boolean check (int number, int choice)

This function checks a number and returns the answer as true/false for choices
1. Prime
2. Palindrome
3. Perfect
4. Special
5. Neon
6. Buzz
7. Duck
8. Harshad
9. Automorphic
10. Armstrong
11. Unique
12. Composite
13. Pronic
14. Disarium
15. Spy
16. Twisted Prime

Problem & Solution: Ashutosh Sharma

Why a second solution?
----------------------
Because this code implements some additional functions that remove repetitve code from check()
*/

class Challenge246_version2
{
    //Function to get count of digits of a number
    public int countDigits(int number)
    {
        int digit_count = 0;
        while(number>0)
        {
            digit_count++;
            number /= 10;
        }
        return digit_count;
    }

    //Function to get count of factors of a number
    public int countFactors(int number)
    {
        int factor_count = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0)
            factor_count++;
        }
        return factor_count;
    }

    //Function to get reverse of a number
    public int getReverse(int number)
    {
        int reverse = 0;
        while(number>0)
        {
            reverse = reverse*10 + number%10;
            number /= 10;
        }
        return reverse;
    }

    //Function to get factorial of a number
    public int getFactorial(int number)
    {
        int factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public boolean check(int number, int choice)
    {
        boolean result = false;
        switch(choice)
        {
            case 1:
            case 12:
            //1. Prime: if number of factors is 2
            //12. Composite: if number of factors is > 2
            int count = countFactors(number);
            if((count == 2 && choice == 1) || (count != 2 && choice == 12))
            result = true;
            break;

            case 2:
            //Palindrome: If number == reverse
            int temp = number;
            int rev = getReverse(number);
            if(rev == temp)
            result = true;
            break;

            case 3:
            //Perfect: If number == sum of its factors excluding 1
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if(number%i==0)
                sum += i;
            }
            if(sum == number)
            result = true;
            break;

            case 4:
            //Special: Sum of factorials of digits == number
            sum = 0;
            temp = number;
            while(number>0)
            {
                int rem = number%10;
                sum += getFactorial(rem);
                number /= 10;
            }
            if(sum == temp)
            result = true;
            break;

            case 5:
            //Neon: Sum of digits of square == number
            int square = number*number;
            sum = 0;
            while(square>0)
            {
                sum += square%10;
                square /= 10;
            }
            if(sum == number)
            result = true;
            break;

            case 6:
            //Buzz: Number ends with 7 or is divisible by 7
            if(number%10 == 7 || number%7 == 0)
            result = true;
            break;

            case 7:
            //Duck: Number has a 0
            while(number>0)
            {
                if(number%10 == 0)
                {
                    result = true;
                    break;
                }
                number /= 10;
            }
            break;

            case 8:
            //Harshad: Number is divisible by sum of its digits
            sum = 0;
            temp = number;
            while(number>0)
            {
                sum += number%10;
                number /= 10;
            }
            if(temp%sum == 0)
            result = true;
            break;

            case 9:
            //Automorphic: Number is present in the last digits of its square
            count = countDigits(number);
            square = number*number;
            if(square % (int) Math.pow(10, count) == number)
            result = true;
            break;

            case 10:
            //Armstrong: If sum of cubes of digits == number
            temp = number;
            sum = 0;
            while(number>0)
            {
                sum += (int) Math.pow(number%10, 3);
                number /= 10;
            }
            if(sum == temp)
            result = true;
            break;

            case 11:
            //Unique: if none of the digits repeat
            result = true;
            temp = number;
            for (int i = 0; i < 10; i++) {
                count = 0;
                number = temp;
                while(number>0)
                {
                    if(number%10 == i)
                    count++;
                    if(count>1)
                    {
                        result = false;
                        break;
                    }
                    number /= 10;
                }
                if(result == false)
                break;
            }
            break;

            case 13:
            //Pronic: Number is product of 2 consecutive integers
            int sqrt = (int) Math.sqrt(number);
            if(sqrt * (sqrt + 1) == number)
            result = true;
            break;

            case 14:
            //Disarium: Sum of digits in number powered with respective position == number
            count = countDigits(number);
            temp = number;
            sum = 0;
            while(number>0)
            {
                int rem = number%10;
                sum += (int) Math.pow(rem, count);
                count--;
                number /= 10;
            }
            if(sum == temp)
            result = true;
            break;

            case 15:
            //Spy: Sum of digits of number == product of digits of number
            sum = 0;
            int pro = 1;
            while(number>0)
            {
                int rem = number%10;
                sum += rem;
                pro *= rem;
                number /= 10;
            }
            if(sum == pro)
            result = true;
            break;

            case 16:
            //Twisted prime: If reverse of number (if prime) is also prime
            count = countFactors(number);
            if(count == 2)
            {
                if(countFactors(getReverse(number)) == 2)
                result = true;
            }
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        Challenge246_version2 o = new Challenge246_version2();
        System.out.println("Is 144 Prime? "+o.check(144, 1));
        System.out.println("Is 121 Palindrome? "+o.check(121, 2));
        System.out.println("Is 496 Perfect? "+o.check(496, 3));
        System.out.println("Is 145 Special? "+o.check(145, 4));
        System.out.println("Is 9 Neon? "+o.check(9, 5));
        System.out.println("Is 12 Buzz? "+o.check(12, 6));
        System.out.println("Is 41036 Duck? "+o.check(41036, 7));
        System.out.println("Is 152 Harshad? "+o.check(152, 8));
        System.out.println("Is 25 Automorphic? "+o.check(25, 9));
        System.out.println("Is 370 Armstrong? "+o.check(370, 10));
        System.out.println("Is 12345 Unique? "+o.check(12345, 11));
        System.out.println("Is 13 Composite? "+o.check(13, 12));
        System.out.println("Is 30 Pronic? "+o.check(30, 13));
        System.out.println("Is 135 Disarium? "+o.check(135, 14));
        System.out.println("Is 1124 Spy? "+o.check(1124, 15));
        System.out.println("Is 37 Twisted Prime? "+o.check(37, 16));
        System.out.println("Is Windows better than Linux? "+o.check(123, 404)+" :D");
    }
}
