package LinkedList;
//24
public class SwapNodeInPairs
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
        Node(int number, Node next)
        {
            this.number = number;
            this.next = next;
        }
    }

    public static Node Swap(Node head)
    {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        while(prev.next!=null && prev.next.next!=null)
        {
            Node first = prev.next;
            Node second = first.next;
            Node nextpair = second.next;
            prev.next = second;
            second.next = first;
            first.next = nextpair;
            prev = first;
        }
        return dummy.next;
    }

    public static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.number +"-->");
            temp = temp.next;
        }
        System.out.println("END");
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
        Node head = first;
        System.out.println("Linked List before Swap");
        display(head);
        System.out.println("Linked List after Swap");
        head = Swap(head);
        display(head);
    }
    
}
