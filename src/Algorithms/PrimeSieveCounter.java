package Algorithms;
import java.util.*;
public class PrimeSieveCounter
{
    public static void main(String args[])
    {
        System.out.println(Counter(10));

    }
    public static int Counter(final int n)
    {
        int count=0;
        boolean[] touched = new boolean[n+1];
        double root = Math.sqrt(n);
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for(int i=2;i<n;i+=2)
        {
            touched[i]=true;
        }
        for(int i=3;i<=root;i++)
        {
            if(!touched[i])
            {
                for(int j=i*i;j<=n;j=j+(i*2))
                {
                    touched[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(!touched[i])
            {
                primes.add(i);
                count++;
            }
        }
        return count;
    }
    
}
