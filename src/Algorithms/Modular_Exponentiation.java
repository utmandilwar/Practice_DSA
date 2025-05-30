package Algorithms;
import java.util.*;
public class Modular_Exponentiation
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the base number");
        int a = scr.nextInt();
        System.out.println("Enter the power value");
        int N= scr.nextInt();
        System.out.println("Enter the modulus value");
        int M=scr.nextInt();
        System.out.println(power(a , N , M));
        scr.close();
    }
    public static long power(int a, int N, int M)
    {
        if(N==0)
        {
            return 1;
        }
        else
        {
            long R = power(a, N/2, M);
            if(N%2==0)
            {
                return (R * R) % M;
            }
            else
            {
                return (R * R * a) % M;
            }
        }
    }
}
