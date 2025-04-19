package Pattern;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the row of the pattern");
        int row=scr.nextInt();
        System.out.println("Enter the column of the pattern");
        int column=scr.nextInt();
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
