package Pattern;
import java.util.*;
public class Pattern1 {
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the length of the pattern");
        int m=scr.nextInt();
        System.out.println("Enter the breadth of the pattern");
        int n=scr.nextInt();
        for(int i=1; i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
