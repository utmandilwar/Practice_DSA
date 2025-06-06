package Recursion;
public class OnetoN
{
    public static void main(String args[])
    {
        range_asc(0,8);
        System.out.println();
        range_desc(0,8);
    }
    public static void range_asc(int i, int N)
    {
        if(i==N)
        {
            System.out.print(i);
            return;
        }
        System.out.print(i);
        range_asc(i+1, N);
    }
    public static void range_desc(int i, int N)
    {
        if(i==N)
        {
            System.out.print(N);
            return;
        }
        System.out.print(N);
        range_desc(i, N-1);
    }
}
