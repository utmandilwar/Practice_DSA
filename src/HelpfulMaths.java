import java.util.*;

public class HelpfulMaths
{
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        String input = scr.nextLine();
        scr.close();
        String[] numbers= input.split("\\+");
        Arrays.sort(numbers);
        System.out.println(String.join("+",numbers));
    }
}