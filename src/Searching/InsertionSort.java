package Searching;
import java.io.*;
import java.util.Arrays;
public class InsertionSort
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int n= Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int result[] = Insertion_optimised(n, arr);
        System.out.println("The array after insertion optimised is: "+Arrays.toString(result));
        int result2[] = Insertion_swap(n, arr);
        System.out.println("The array after insertion swap is : " +Arrays.toString(result2));
    }
    public static int[] Insertion_optimised(int n, int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }
    public static int[] Insertion_swap(int n, int arr[])
    {
        for(int i=0; i<= n-1; i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }
}
