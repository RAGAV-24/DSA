
import java.util.*;
public class Rec1
{
    // int arr[];
    public static int fib(int i)
    {
        if(i==0||i==1)
        {
            return 1;

        }
        System.out.println(i);
        return fib(i-1)+fib(i-2);

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // arr=new int[a];
        int j=fib(a);
        System.out.println(j);

    }
}