package Arrays;
import java.util.*;
public class NumsWidEvenDigits
//1295 leetcode
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scr.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scr.nextInt();
        }
        System.out.println("The entered array is:"+Arrays.toString(arr));
        NumsWidEvenDigits obj = new NumsWidEvenDigits();
        int result= obj.NumsWidEvenDigits(arr, size);
        System.out.println("The count of numbers with even digits in the entered array is: "+result);
    }
    public int NumsWidEvenDigits(int arr[], int size)
    {
        int countf=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            int num=arr[i];
            while(num!=0)
            {
                num/=10;
                count++;
            }
            if(count%2==0)
            {
                countf++;
            }
        }
        return countf;
    }  
}
