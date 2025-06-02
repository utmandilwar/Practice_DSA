package Algorithms;
import java.util.*;
public class Eiclidean_Modulus
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= scr.nextInt();
        System.out.println("Enter the second number");
        int b=scr.nextInt();
        System.out.println("The GCD of the given number is = "+gcd(a, b));
        scr.close();
    }

    public static int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd( b , a % b);
        }
    }
}
