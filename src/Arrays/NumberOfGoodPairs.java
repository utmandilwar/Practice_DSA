package Arrays;
import java.util.*;
public class NumberOfGoodPairs
//1512 leetcode
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scr.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=scr.nextInt();
        }
        NumberOfGoodPairs obj = new NumberOfGoodPairs();
        int result = obj.NumberOfGoodPairs(nums, size);
        System.out.println("The number of good pairs : "+result); 
    }
    public int NumberOfGoodPairs(int nums[], int size)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j]&& i<j)
                {
                    count++;
                }
            }
        }
        return count;
    } 
}
