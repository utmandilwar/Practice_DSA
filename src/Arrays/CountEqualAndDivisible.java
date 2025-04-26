package Arrays;
import java.util.*;
public class CountEqualAndDivisible
//2176 leetcode
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scr.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=scr.nextInt();
        }
        System.out.println("Enter the value of K");
        int k=scr.nextInt();
        CountEqualAndDivisible obj = new CountEqualAndDivisible();
        int result=obj.CountEqualAndDivisible(nums, size, k);
        System.out.println("Number of pairs that satisfy the conditions are: "+result);
    }

    public int CountEqualAndDivisible(int nums[], int size, int k)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j]&& i*j%k==0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
