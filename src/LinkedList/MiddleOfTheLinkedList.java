package LinkedList;
//876
public class MiddleOfTheLinkedList
{
    Node head;
    class Node
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

    public Node middle()
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    MiddleOfTheLinkedList(int[] values)
    {
        if (values.length == 0)
        {
            return;
        }
        head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++)
        {
            current.next = new Node(values[i]);
            current = current.next;
        }
    }
    public static void main(String args[])
    {
        int values[] = {1, 2, 3, 4, 5};
        MiddleOfTheLinkedList List = new MiddleOfTheLinkedList(values);
        System.out.println(List.middle().number);
    }
}
