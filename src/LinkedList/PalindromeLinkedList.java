package LinkedList;
//234
public class PalindromeLinkedList
{
    Node head;
    static class Node
    {
        int number;
        Node next;
        Node(int number)
        {
            this.number = number;
        }
        Node(int number , Node next)
        {
            this.number = number;
            this.next = next;
        }
    }

    public static boolean Palindrome(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondpart = null;
        if(fast==null)
        {
            secondpart = slow;
        }
        else
        {
            secondpart = slow.next;
        }
        Node prev = null;
        Node current = secondpart;
        Node next;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondpart = prev;
        Node firstpart = head;
        while(secondpart!=null)
        {
            if(firstpart.number != secondpart.number)
            {
                return false;
            }
            firstpart = firstpart.next;
            secondpart = secondpart.next;
        }
        return true;
    }

    public static void main(String args[])
    {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(2);
        Node fourth = new Node(1);
        first.next = second;
        second.next = third;
        third.next = fourth;
        Node head = first;
        System.out.println(Palindrome(head));    
    }
}
