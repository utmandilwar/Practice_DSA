package Arrays;
import java.util.*;
public class ConsecutiveOdds
//1550 leetcode
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scr.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scr.nextInt();
        }
        System.out.println("The entered array is: "+Arrays.toString(arr));
        ConsecutiveOdds obj = new ConsecutiveOdds();
        boolean result= obj.ConsecutiveOdds(arr, size);
        System.out.println("The statment that the given array has 3 consecutive odds are: "+result);

    }
    public boolean ConsecutiveOdds(int arr[], int size)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count==3)
            return true;
        }
        return false;
    }
}
