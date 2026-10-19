package LinkedList;
//203
public class RemoveLinkedListElements
{
    Node head;
    static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
        }
        Node(int val, Node next)
        {
            this.val = val;
            this.next = next;
        }
    }

    public static void RemoveElement(Node head, int n)
    {
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;
        while(current!=null && current.next!=null)
        {
            if(current.next.val == n)
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
        while(temp.next!=null)
        {
            System.out.print(temp.val +"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public static void main(String args[])
    {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(4);
        Node fourth = new Node(2);
        Node fifth = new Node(6);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        Node head = first;
        System.out.println("The Linked List before removing the elements");
        display(head);
        RemoveElement(head, 2);
        System.out.println("The Linked List after entering the element 2 to remove");
        display(head);
    }
}
