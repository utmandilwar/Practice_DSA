package Arrays;
import java.util.*;
public class SumOfUniqueNumbers 
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
        SumOfUniqueNumbers obj= new SumOfUniqueNumbers();
        int result= obj.SumOfUniqueNumbers(arr, size);
        System.out.println("The sum of the Unique Numbers in the array is: "+result);
    }

    public int SumOfUniqueNumbers(int arr[], int size)
    {
        int big[] = new int[101];
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            big[arr[i]]+=1;
        }
        for(int i=1;i<big.length;i++)
        {
            if(big[i]==1)
            {
                sum+=i;
            }
        }
        return sum;
    }
}
