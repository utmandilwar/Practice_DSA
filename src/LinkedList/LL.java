package LinkedList;

public class LL
{
    private Node head;
    class Node
    {
        int number;
        Node next;
        Node(int number)
        {
            this.number = number;
            this.next = null;
        }
    }

    public void addFirst(int number)
    {
        Node newNode = new Node(number);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int number)
    {
        Node newNode = new Node(number);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        {
            while(currNode.next!=null)
            {
                currNode = currNode.next;
            }
            currNode.next=newNode;
        }
    }
    public void printList()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
        }
        Node currNode = head;
        while(currNode!= null)
        {
            System.out.print(currNode.number+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[])
    {
        LL list = new LL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);

        list.printList();
    }
    
    
}
