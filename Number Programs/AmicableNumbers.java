//If the sum of proper divisors of one number = the other number and vice versa, then the two numbers are called as amicable numbers.
import java.util.*;
class AmicableNumbers 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        int sum1 = 0, sum2 = 0;

        // Sum of proper divisors of num1
        for(int i = 1; i <= num1/2; i++) 
        {
            if(num1 % i == 0) 
            {
                sum1 += i;
            }
        }

        // Sum of proper divisors of num2
        for(int i = 1; i <= num2/2; i++) 
        {
            if(num2 % i == 0) 
            {
                sum2 += i;
            }
        }

        // Check if amicable
        if(sum1 == num2 && sum2 == num1) 
        {
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");
        } else
        {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
        }
        sc.close();
    }
}
