//If the numbers have only two factors, 1 and the number itself, it is called a prime number.
import java.util.*;
class Prime
{
    public static void main()
    {
        int n,i,t=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                t=t+1;
            }
        }
        if(t==2)
        {
        System.out.println("PRIME NUMBER");
    }
    else
    {
        System.out.println("NOT A PRIME NUMBER");
    }
}
}
