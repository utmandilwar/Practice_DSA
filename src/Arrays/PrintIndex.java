package Arrays;
import java.util.*;
public class PrintIndex 
{
    public static void main(String args[])
    {
    Scanner scr= new Scanner(System.in);
    //array initialisation
    System.out.println("Enter size of the array");
    int size= scr.nextInt();
    System.out.println("Enter the elements of the array");
    int numbers[] = new int[size];
    //input
    for(int i=0;i<size;i++)
    {
        numbers[i]=scr.nextInt();
    }
    System.out.println("Enter the number to be searched");
    int x=scr.nextInt();
    for(int i=0;i<size;i++)
    {
        //searching
        if(numbers[i]==x)
        {
            System.out.println(+ x +" found at index: "+i);
        }
    }
   }
}
