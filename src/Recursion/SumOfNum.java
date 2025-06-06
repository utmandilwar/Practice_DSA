package Recursion;
public class SumOfNum
{
    public static void main(String args[])
    {
        printSum(1,5,0);

    }
    public static void printSum(int i, int num, int sum)
    {
        if(num==i)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,num,sum);
    }
}
