import java.util.*;
public class BoyorGirl
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        String input=scr.next();

        HashSet<Character> uniquechar =new HashSet<>();
        for(int i=0;i<input.length();i++)
        {
            uniquechar.add(input.charAt(i));
        }
        if(uniquechar.size()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}