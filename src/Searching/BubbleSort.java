package Searching;
import java.util.*;
public class BubbleSort
{
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scr.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=scr.nextInt();
        }
        System.out.println("The array input is: "+Arrays.toString(arr));
        BubbleSort obj = new BubbleSort();
        int[] result = obj.BubbleSort2(arr, size);
        System.out.println("The input array after Sorting is: "+Arrays.toString(result));
        scr.close();
    }
    public int[] BubbleSort2(int[] arr, int size)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    } 
}

