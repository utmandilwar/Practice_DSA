package Arrays;
import java.util.*;
public class NumsSmallerThan
//1365 leetcode
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scr.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scr.nextInt();
        }
        System.out.println("The input array is: "+Arrays.toString(arr));
        NumsSmallerThan obj= new NumsSmallerThan();
        int result[] = obj.NumsSmallerThan(arr, size);
        System.out.println("The numbers smaller than the arrays in order are: ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+",");
        }
    }

    public int[] NumsSmallerThan(int arr[], int size)
    {
        int arr2[]= new int[size];
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                count++;
            }
            arr2[i]=count;
        }
        return arr2;
    }
}
