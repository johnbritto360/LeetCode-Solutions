/*
206. Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:

Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []

Constraints:

🎱The number of nodes in the list is the range [0, 5000].
🎱-5000 <= Node.val <= 5000

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
LeetCode solution can be found at the end of this file.
*/

//Reversing Linked List with Driver Code in Java:
class RevLinkedList{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node reverseList(Node node){
        Node previous=null;
        Node current=node;
        Node next=null;
        while (current!=null) {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        node=previous;
        return node;
    }
    void printList(Node node){
        while(node!=null) {
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    public static void main(String[] xnxx){
        RevLinkedList list=new RevLinkedList();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        list.head.next.next.next=new Node(4);
        list.head.next.next.next.next=new Node(5);
        head=list.reverseList(head);
        list.printList(head);
    }
}

//LeetCode solution in Java:
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cuurent=head,next,previous=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            if(next==null){break;}
            previous=current;
            current=next;
        }
        return current;
    }
}
*/