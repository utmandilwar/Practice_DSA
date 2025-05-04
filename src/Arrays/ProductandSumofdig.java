package Arrays;
import java.util.*;
public class ProductandSumofdig
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scr.nextInt();
        ProductandSumofdig obj = new ProductandSumofdig();
        obj.ProductandSumofdig(num);
    }
    public void ProductandSumofdig(int num)
    {
        int sum=0;
        int product=1;

        for(int i=0;i<num;i++)
        {
            while(num!=0)
            {
                int q=num%10;
                sum+=q;
                product*=q;
                num/=10;
            }
        }
        System.out.println("The sum of the digits of the number is: "+sum);
        System.out.println("The product of the digits of the number is: "+product);
    }
}
