package Algorithms;
import java.util.*;
public class Fast_Exponentiation
{
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the base number");
        int a = scr.nextInt();
        System.out.println("Enter the power value");
        int N=scr.nextInt();
        //System.out.println(Exponent(a, N));
    }
    public static int Exponent(int a, int N)
    {
        if(N==0)
        {
            return 1;
        }
        else
        {
            int R = Exponent(a, N/2);
            if(N%2==0)
            {
                return R * R;
            }
            else
            {
                return R * R * a;
            }
        }
    }
}
