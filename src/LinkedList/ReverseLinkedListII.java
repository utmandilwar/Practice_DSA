package LinkedList;
//92
public class ReverseLinkedListII
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

    public static Node reverseBetween(Node head, int left, int right)
    {
        Node dummy = new Node(0);
        dummy.next = head;
        Node before = dummy;
        for(int i=1;i<left;i++)
        {
            before = before.next;
        }
        Node prev = null;
        Node current = before.next;
        Node reverseTail = current;
        int count = right - left + 1;
        while(count>0)
        {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count--;
        }
        before.next = prev;
        reverseTail.next = current;
        return dummy.next;
    }
    
    public static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.number+ "-->");
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
        Node fifth = new Node(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        Node head = first;
        System.out.println("LinkedList before reversal");
        display(head);
        System.out.println("LinkedList after reversal");
        head = reverseBetween(head, 2, 4);
        display(head);
    }
}
