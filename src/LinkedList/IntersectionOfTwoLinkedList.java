package LinkedList;
//160
public class IntersectionOfTwoLinkedList
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

    public static Node Intersection(Node head1, Node head2)
    {
        Node first = head1;
        Node second = head2;
        while(first != second)
        {
            if(first == null)
            {
                first = head2;
            }
            else
                first = first.next;
            if(second == null)
            {
                second = head1;
            }
            else
                second = second.next;
        }
        return first;
    }

    public static void main(String args[])
    {
        Node F1 = new Node(1);
        Node F2 = new Node(2);
        Node F3 = new Node(3);
        Node F4 = new Node(4);
        F1.next = F2;
        F2.next = F3;
        F3.next = F4;
        Node head1 = F1;
        Node S1 = new Node(5);
        Node S2 = new Node(6);
        Node S3 = new Node(7);
        S1.next = S2;
        S2.next = S3;
        S3.next = F3;
        Node head2 = S1;
        System.out.println(Intersection(head1, head2).number);
    }
}
