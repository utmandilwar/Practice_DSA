package Arrays;
import java.io.*;
public class LongestSubArray
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the sum whose subarray to be found");
        int k=Integer.parseInt(br.readLine());
        System.out.println("The longest SubArray using brute force is : " +subarray(n, arr, k));
    }
    //brute-force
    public static int subarray(int n, int arr[], int k)
    {
        int length=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0; 
                for(int l=i;l<=j;l++)
                {
                    sum+=arr[l];
                }
                if(sum==k)
                {
                    length = Math.max(length, j-i+1);
                }
            }
        }
        return length;
    }
    //using two pointers
    
}
