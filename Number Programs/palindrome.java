// If the reversed number is equal to the inputted number then the number is called as a palindrome number. for example: 11 is reversed as 11.
import java.util.*;
class palindrome
{
    public int PALINDROME(int n)
    {
        int r=0,a;
        while(n!=0)
        {
            a=n%10;
            r=r*10+a;
            n=n/10;
        }
        return(r);
    }
    public static void main()
    {
        int r1=0,n1;
        Scanner sc = new Scanner(System.in);
        palindrome ob = new palindrome();
        System.out.println("ENTER YOUR NUMBER");
        n1=sc.nextInt();
        r1=ob.PALINDROME(n1);
        if(n1==r1)
        System.out.println("Palindrome Number");
        else 
        System.out.println("NOT PALINDROME");
    }
}
