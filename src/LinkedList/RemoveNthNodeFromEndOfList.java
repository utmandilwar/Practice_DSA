package LinkedList;
//19
public class RemoveNthNodeFromEndOfList
{
    static Node head;
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
    
    public static Node Remove(Node head, int n)
    {
        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;
        for(int i=0;i<n;i++)
        {
            fast = fast.next;
        }
        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String args[])
    {
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(6);
        first.next = second;
        second.next = third;
        third.next = fourth;
        head = first;
        Remove(head,2);
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.number+ "-->");
            current = current.next;
        }
        System.out.println("END");
    }
}
