package Algorithms;
import java.util.*;
public class SumOfDivisors
{
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scr.nextInt();
        System.out.println("The number of divisors of entered number is :" +Divisors(num));
        scr.close();
    }
    public static int Divisors(int num)
    {
        int count=0;
        // from 1 to square root of the number
        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                //this is checked to avoid the square root of the value being counted twice
                if(num%i!=1)
                    count++;
            }
        }
        return count*2;
    }
    
}
