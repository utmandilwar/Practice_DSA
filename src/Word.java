import java.util.*;
public class Word
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        String s= scr.nextLine();
        int upper=0;
        int lower =0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                upper++;
            else    
                lower++;
        }
        if(upper>lower)
            System.out.println(s.toUpperCase());
        else
            System.out.println(s.toLowerCase());
    }
}