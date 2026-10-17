package LinkedList;
//206
public class ReverseLinkedList 
{
    private Node head;

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

    public ReverseLinkedList(int[] values)
    {
        Node tail = null;
        for (int value : values)
        {
            Node node = new Node(value);
            if (head == null)
            {
                head = node;
            }
            else
            {
                tail.next = node;
            }
            tail = node;
        }
    }

    public void Reverse()
    {
        Node prev = null;
        Node current = head;
        Node next;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.number + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String args[])
    {
        int[] values = {1, 2, 3, 4, 5};
        ReverseLinkedList list = new ReverseLinkedList(values);
        System.out.print("Original: ");
        list.display();
        list.Reverse();
        System.out.print("Reversed: ");
        list.display();
    }

    
}
