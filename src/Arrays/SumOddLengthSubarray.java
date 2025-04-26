package Arrays;
import java.util.*;
public class SumOddLengthSubarray
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= scr.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scr.nextInt();
        }
        SumOddLengthSubarray obj = new SumOddLengthSubarray();
        int result = obj.SumOddLengthSubarray(arr, size);
        System.out.println("The Sum of odd Length Subarrays is: "+result);
    }

    public int SumOddLengthSubarray(int arr[], int size)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j+=2)
            {
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
            }
        }
        return sum;
    }
    
}
