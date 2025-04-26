package Arrays;
import java.util.*;
public class ShuffleTheArray
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the even size of the array");
        int size=scr.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scr.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        ShuffleTheArray obj= new ShuffleTheArray();
        int result[]=obj.ShuffleTheArray(arr, size);
        System.out.println("The elements after the shuffle are: ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+ " ");
        }
    }
    public int[] ShuffleTheArray(int arr[], int size)
    {
        int pos=0;
        int[] arr2 = new int[size];
        for(int i=0,j=arr.length/2;i<arr.length/2&&j<arr.length;i++,j++)
        {
            arr2[pos]=arr[i];
            pos++;
            arr2[pos]=arr[j];
            pos++;
        }
        return arr2;
    }
    
}
