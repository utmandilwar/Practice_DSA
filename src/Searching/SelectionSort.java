package Searching;
import java.io.*;
import java.util.Arrays;
public class SelectionSort
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int N = Integer.parseInt(br.readLine());
        int arr[]= new int[N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int result[] = selection(N, arr);
        System.out.println("The sorted array is :" + Arrays.toString(result));

    }
    public static int[] selection(int N, int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int minimum=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    minimum=arr[j];
                }
            }
            //swap
            int temp=arr[minimum];
            arr[minimum]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    
}
