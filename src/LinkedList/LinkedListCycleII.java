package LinkedList;
//142
public class LinkedListCycleII
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
        Node(int number , Node next)
        {
            this.number = number;
            this.next = next;
        }
    }

    public static Node CycleStarts(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        if(fast == null || fast.next == null)
        {
            return null;
        }
        slow = head;
        while(slow!=fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
        

    public static void main(String argsp[])
    {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        System.out.println(CycleStarts(first).number);
    }
    
}
