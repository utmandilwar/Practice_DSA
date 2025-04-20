package Arrays;
import java.util.*;

public class TwoSum
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scr.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scr.nextInt();
        }
        System.out.println("Enter the target number");
        int target = scr.nextInt();

        TwoSum twoSum = new TwoSum();
        int result[] = twoSum.TwoSumm(arr, target);
        if(result!=null)
        {
            System.out.println("Indices of the two numbers that sum to target: "+result[0]+ " "+result[1]);
        }
        else
        {
            System.out.println("No two elements sum up to the target");
        }
    }

    public int[] TwoSumm(int arr[] ,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]== target)
                {
                    return new int[] {i , j};
                }
            }
        }
        return null;
    }
    
}
