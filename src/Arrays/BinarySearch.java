package Arrays;
import java.util.*;
public class BinarySearch
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
        System.out.println("Enter the target element from the array");
        int target = scr.nextInt();
        System.out.println("The array entered is: "+Arrays.toString(arr));
        BinarySearch obj = new BinarySearch();
        int result = obj.BinarySearch(arr, target, size);
        System.out.println("The index of the target element in the above given array is: "+result);
    }
    public int BinarySearch(int arr[], int target, int size)
    {
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                index=i;
            }
        }
        return index;
    }
}
