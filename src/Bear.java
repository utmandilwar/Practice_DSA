import java.util.*;
public class Bear
{
     public static void main(String args[])
     {
          Scanner scr= new Scanner(System.in);
          int a=scr.nextInt();
          int b=scr.nextInt();
          int count=0;
          while(a<=b)
          {
               a=a*3;
               b=b*2;
                count++;
          }
          System.out.println(count);
     }
}