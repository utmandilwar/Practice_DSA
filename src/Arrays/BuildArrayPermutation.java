package Arrays;
import java.util.*;
public class BuildArrayPermutation
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
        System.out.println("The array before Permutation: "+Arrays.toString(arr));
        BuildArrayPermutation obj = new BuildArrayPermutation();
        int result[] =obj.BuildArrayPermutation(arr, size);
        System.out.println("The Array after Permutation: "+Arrays.toString(result));
    }
    public int[] BuildArrayPermutation(int arr[], int size)
    {
        int arr2[] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[arr[i]];
        }
        return arr2;
    }
}
