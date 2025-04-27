package Arrays;
import java.util.*;
public class RichestCustomerWealth
//1672 leetcode
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the rows of the array");
        int rows=scr.nextInt();
        System.out.println("Enter the column of the array");
        int column=scr.nextInt();
        int arr[][] = new int[rows][column];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=scr.nextInt();
            }
        }
        System.out.println("The entered array is: "+Arrays.deepToString(arr));
        RichestCustomerWealth obj = new RichestCustomerWealth();
        int result= obj.RichestCustomerWealth(arr, rows, column);
        System.out.println("The maximun wealth according to the given DD Array is: "+result);
    }

    public int RichestCustomerWealth(int arr[][], int rows, int column)
    {
        int max=0;
        for(int i=0;i<rows;i++)
        {
            int sum=0;
            for(int j=0;j<column;j++)
            {
                sum+=arr[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}

