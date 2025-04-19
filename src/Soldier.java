import java.util.*;
public class Soldier
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        int k=scr.nextInt();
        int n=scr.nextInt();
        int w=scr.nextInt();
        int sum=0;
        for(int i=1;i<=w;i++)
        {
            sum+=k*i;
        }
        if(sum-n<0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(sum-n);
        }
    }
}