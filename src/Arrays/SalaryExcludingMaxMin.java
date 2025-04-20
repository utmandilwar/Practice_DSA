package Arrays;
import java.util.*;
public class SalaryExcludingMaxMin 
//**1491** 
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= scr.nextInt();
        if(size<=2)
        {
            System.out.println("Average excluding max and min is not available");
        }
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scr.nextInt();
        }
        SalaryExcludingMaxMin obj = new SalaryExcludingMaxMin();
        double result = obj.avg(arr);
        {
            System.out.println("The average excluding the max and min is: "+ result);
        }
    }

        public double avg(int arr[])
        {
            Arrays.sort(arr);
            int sum=0;
            for(int i=1;i<arr.length-1;i++)
            {
                sum+=arr[i];
            }
            return (double) sum / (arr.length-2);
        }
}
