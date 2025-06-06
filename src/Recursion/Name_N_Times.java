package Recursion;

public class Name_N_Times
{
    public static void main(String args[])
    {
        repeat(5,"Utkarsh");
    }
    public static void repeat(int N, String name)
    {
        if(N==1)
        {
            System.out.println(name);
            return;
        }
        System.out.println(name);
        repeat(N-1, name);
    }
    
}
