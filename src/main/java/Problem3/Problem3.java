package Problem3;

import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        static Node head;
        class Node {

            int data;
            Node next;

            Node(int d)
            {
                data = d;
                next = null;
            }
        }
        void printList(Node node)
        {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        System.out.println();
    }


}
