package LinkedList;

public class Practice {

    private Node head;
    private Node tail;
    private int size;
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

    public void addFirst(int number)
    {
        Node node = new Node(number);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size+=1;
    }

    public void addLast(int number)
    {
        Node newnode = new Node(number);
        tail.next = newnode;
        tail = newnode;
        if(tail == null)
        {
            return;
        }
    }

    public void Insert(int number, int index)
    {
        if(index == 0)
        {
            addFirst(number);
            return;
        }
        if(index == size)
        {
            addLast(number);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp = temp.next;
        }
        Node newnode = new Node(number , temp.next);
        temp.next = newnode;
    }

    public void deleteFirst()
    {
        if(head == null)
        {
            throw new RuntimeException("The list is empty");
        }
        int value = head.number;
        head = head.next;
        size--;
    }

    public void deleteLast()
    {
        if(head == null)
        {
            throw new RuntimeException("The list is empty");
        }
        if(head.next == null)
        {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void reverse()
    {
        Node prev = null;
        Node current = head;
        Node next;
        while(current != null)
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
        while(temp != null)
        {
            System.out.print(temp.number + "-->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public static void main(String args[])
    {
        Practice List = new Practice();
        List.addFirst(10);
        List.addFirst(12);
        List.addFirst(8);
        List.display();
        System.out.println();
        List.addLast(55);
        List.display();
        System.out.println();
        List.Insert(44, 1);
        List.display();
        System.out.println();
        List.deleteFirst();
        List.display();
        System.out.println();
        List.deleteLast();
        List.display();
        System.out.println();
        List.reverse();
        List.display();
    }
}
