package Algorithms;
import java.io.*;
public class NumberOfDivisorsAdvance
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        long num = Integer.parseInt(br.readLine());
        System.out.println("The number of Divisors are : " + numberOfDivisors(num));
    }
    public static long numberOfDivisors(long num)
    {
        long total = 1;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                int e=0;
                do
                {
                    e++;
                    num/=i;
                }
                while(num%i==0);
                total*=e+1;
            }
        }
        if(num>1)
        {
            total*=2;
        }
        return total;
    }
}
