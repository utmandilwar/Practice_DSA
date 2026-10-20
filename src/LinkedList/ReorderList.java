package LinkedList;
//143
public class ReorderList
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

    public static void Reorder(Node head)
    {
        if(head == null || head.next == null)
        {
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node second = slow.next;
        slow.next = null;
        Node prev = null;
        Node current = second;
        Node next;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node first = head;
        second = prev;
        while(second!=null)
        {
            Node nextfirst = first.next;
            Node nextsecond = second.next;
            first.next = second;
            second.next = nextfirst;
            first = nextfirst;
            second = nextsecond;
        }
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
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next =fifth;
        fifth.next = sixth;
        Node head = first;
        System.out.println("Linked list before Reorder");
        display(head);
        System.out.println("Linked List after Reorder is done");
        Reorder(head);
        display(head);
    }
}