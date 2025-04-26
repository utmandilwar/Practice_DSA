package Arrays;
import java.util.*;
public class ConcatenationOfArray
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= scr.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scr.nextInt();
        }
        ConcatenationOfArray obj = new ConcatenationOfArray();
        int[] result = obj.ConcatenationOfArray(arr, size);

        System.out.println("Concatenated Array:");
        for(int i=0; i<result.length;i++)
        {
            System.out.println(result[i]+ " ");
        }

    }
    public int[] ConcatenationOfArray(int arr[], int size)
    {
        int index=0;
        int count=0;
        int arr2[] = new int[size*2];
        while(count<2)
        {
            for(int i=0;i<size;i++)
            {
                arr2[index++]=arr[i];
            }
            count++;
        }
        return arr2;
    }
}

    

