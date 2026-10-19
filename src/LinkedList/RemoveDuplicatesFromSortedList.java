package LinkedList;
//83
public class RemoveDuplicatesFromSortedList
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

    public static void RemoveDup(Node head)
    {
        Node current = head;
        while(current!=null && current.next!=null)
        {
            if(current.number == current.next.number)
            {
                current.next = current.next.next;
            }
            else
                current = current.next;
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
        Node third = new Node(2);
        Node fourth = new Node(4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        Node head = first;
        display(head);
        RemoveDup(head);
        display(head);
    }
}
