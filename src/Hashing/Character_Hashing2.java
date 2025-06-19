package Hashing;
import java.io.*;
public class Character_Hashing2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any String");
        String str=br.readLine();
        int hash[] = new int[26];
        for(int i=0;i<str.length();i++)
        {
            hash[str.charAt(i)-'a']++;
        }
        System.out.println("Enter the number of queries");
        int num = Integer.parseInt(br.readLine());
        while( num-- > 0)
        {
            char query = br.readLine().charAt(0); 
            System.out.println(hash[query-'a']);
        }
    }
}
