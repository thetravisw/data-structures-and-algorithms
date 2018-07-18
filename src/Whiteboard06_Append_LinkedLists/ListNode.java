package Whiteboard06_Append_LinkedLists;


import java.util.List;

public class ListNode {
    public static void main(String[]args){

    }

    ///  ==================    Begin WB07

    public ListNode NthFromEnd(int n) {
        ListNode current = this.root;
        ListNode next = this.root;
        for (int i = 0; i != n; i++) {
            next = next.link;
        }

        while (next.link != null) {
            next = next.link;
            current = current.link;
        }

        return current;
    }
    ///  ===================  End WB07


    protected int data;
    protected ListNode link;
    protected ListNode root = this;


    //Constructor to Build nodes
    public ListNode(int d, ListNode n) {
        data = d;
        link = n;
    }

    //Constructor I'm actually using.
    public ListNode(int d) {
        data = d;
        link = null;
    }


    public void Append(int value) {
        ListNode appendedNode = new ListNode(value);  ///*
        ListNode current = this.root;
        while (current.link != null) {
            current = current.link;
        }
        current.link = appendedNode;
    }

    public void InsertBefore(int TargetValue, int InsertedValue) {
        //  If target value isn't in the list, automatically append to the end
        ListNode appendedNode = new ListNode(InsertedValue);
        if (this.root.data == TargetValue) {
            Append(InsertedValue);
        }


        ListNode current = this.root;
        while (current.link != null && current.link.data != TargetValue) {
            current = current.link;
        }
        appendedNode.link = current.link;
        current.link = appendedNode;
    }

    public void InsertAfter(int TargetValue, int InsertedValue) {
        //  If target value isn't in the list, automatically append to the end
        ListNode appendedNode = new ListNode(InsertedValue);   //*
        ListNode current = this.root;
        while (current.link != null && current.data != TargetValue) {
            current = current.link;
        }
        appendedNode.link = current.link;

        current.link = appendedNode;
    }

    public void DeleteNode(int TargetValue) {
        ListNode current = this.root;
        if (current.data == TargetValue) {
            this.root = current.link;
        } else {
            while (current.link != null && current.link.data != TargetValue) {
                current = current.link;
            }
            current.link = current.link.link;
        }
    }
}
