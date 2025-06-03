package Algorithms;
import java.io.*;
public class SumOfDivisorsAdvance
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        long num = Integer.parseInt(br.readLine());
        System.out.println("The sum of the divisors of the number is : " +sumOfDiv(num));
    }

    public static long sumOfDiv(long num)
    {
        long output = 1;
        for(int i=2; i*i<=num; i++)
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
                long sum = 0, pro = 1;
                do
                {
                    sum+=pro;
                    pro*=i;
                }
                while(e-- > 0);
                output*=sum;
            }
        }
        if(num>1)
        {
            output*=(num+1);
        }
        return output;
    }
}
