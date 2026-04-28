import java.util.*;
class armstrong
{
    public int ARMSTRONG(int a)
    {
        int b,c=0,d=0,e=a;
        while(a!=0)
        {
            b=a%10;
            c=b*b*b;
            d=d+c;
            a=a/10;
        }
        return(d);
    }
    public static void main()
        {
            int a,e,d;
            Scanner sc = new Scanner(System.in);
            armstrong ob = new armstrong();
            System.out.println("ENTER YOUR NUMBER");
            a=sc.nextInt();
            d=ob.ARMSTRONG(a);
            e=a;
            if(d==e)
            System.out.println("ARMTRONG");
            else
            System.out.println("NOT ARMSTRONG");
        }
}