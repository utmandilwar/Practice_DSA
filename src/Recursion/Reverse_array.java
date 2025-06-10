package Recursion;
import java.io.*;
import java.util.Arrays;
public class Reverse_array
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of the array");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("The original array is : " + Arrays.toString(arr));
        System.out.println("The array after the reversal : " + Arrays.toString(reverse(arr, size)));
        System.out.println("The reversed array after optimised process : " + Arrays.toString(reverse2(arr, size)));
        reverse3(arr, 0, size-1);
        System.out.println("The reversed array is :" + Arrays.toString(arr));
    }
    //brute-force method
    public static int[] reverse(int arr[], int size)
    {
        int newarr[] = new int[size];
        for(int i=size-1;i>=0;i--)
        {
            newarr[size-i-1]=arr[i];
        }
        return newarr;
    }
    //improvised method
    public static int[] reverse2(int arr[], int size)
    {
        for(int i=0, j=arr.length-1;i<j;i++,j--)
        {
            int temp = arr[i];
            arr[i] =  arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    //recursive-method
    public static int[] reverse3(int arr[], int start, int end)
    {
        if(start<end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverse3(arr , start+1, end-1);
        }
        return arr;
    }
}
