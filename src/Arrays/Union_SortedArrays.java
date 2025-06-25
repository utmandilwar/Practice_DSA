package Arrays;
import java.util.*;
public class Union_SortedArrays
{
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int n=scr.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scr.nextInt();
        }
        System.out.println("Enter the size of the second array");
        int n2=scr.nextInt();
        int arr2[] = new int[n2];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=scr.nextInt();
        }
        scr.close();
        ArrayList<Integer> result = union(n, arr, n2, arr2);
        System.out.println("Union of the two arrays:");
        for (int num : result)
        {
            System.out.print(num + " ");
        }
    }
    public static ArrayList<Integer> union(int n, int arr[], int n2, int arr2[])
    {
        HashMap <Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n2;i++)
        {
            map.put(arr2[i], map.getOrDefault(arr2[i],0)+1);
        }
        for(int it : map.keySet())
        {
            Union.add(it);
        }
        return Union;
    }
}
