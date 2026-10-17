package LinkedList;
//21
public class MergeTwoSortedList
{
    Node head;
    public class Node
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
    
    public Node Merge(Node List1, Node List2)
    {
        Node dummy = new Node(0);
        Node current = dummy;
        while(List1 != null && List2 != null)
        {
            if(List1.number <= List2.number)
            {
                current.next = List1;
                current = current.next;
                List1 = List1.next;
            }
            else
            {
                current.next = List2;
                current = current.next;
                List2 = List2.next;
            }
            if(List1!=null)
            {
                current.next = List1;
            }
            else
            {
                current.next = List2;
            }
        }
        return dummy.next;
    }

    MergeTwoSortedList(int[] List)
    {
        if (List.length == 0)
        {
            return;
        }
        head = new Node(List[0]);
        Node current = head;
        for (int i = 1; i < List.length; i++)
        {
            current.next = new Node(List[i]);
            current = current.next;
        }
    }

    public static void main(String args[])
    {
        int List1[] = {1,3,4,6};
        int List2[] = {2,4,5,9};
        MergeTwoSortedList list1 = new MergeTwoSortedList(List1);
        MergeTwoSortedList list2 = new MergeTwoSortedList(List2);
        MergeTwoSortedList merger = new MergeTwoSortedList(new int[]{});
        Node merged = merger.Merge(list1.head, list2.head);
        while (merged != null) 
        {
            System.out.print(merged.number + " -> ");
            merged = merged.next;
        }
        System.out.println("null");
    }
}
