package Hashing;
import java.io.*;
import java.util.HashMap;
public class Hashmap_2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of the array");
        int n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        //compute
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key = arr[i];
            int freq =0;
            if(map.containsKey(key))
            freq=map.get(key);
            freq++;
            map.put(key, freq);
        }
        System.out.println("Enter the amount of time to find the frequency of the number from the array");
        int q=Integer.parseInt(br.readLine());
        while(q-->0)
        {
            System.out.println("Enter the number to find its frequency");
            int number= Integer.parseInt(br.readLine());
            //fetch
            if(map.containsKey(number))
            {
                System.out.println("The frequency of the entered number is :" +map.get(number));
            }
            else
            {
                System.out.println(0);
            }
        }
    }
}
