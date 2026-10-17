package LinkedList;
//141
public class LinkedListCycle
{
    private Node head;
    static class Node
    {
        int number;
        Node next;
        Node(int number)
        {
            this.number = number;
        }
        Node(int number, Node next)
        {
            this.number = number;
            this.next = next;
        }
    }
        
    public static Boolean IsCycle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
    return false;
    }

    public static void main(String args[])
    {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        if(IsCycle(first))
        {
            System.out.println("Cycle detected");
        }
        else
        {
            System.out.println("No Cycle found");
        }
    }
}
