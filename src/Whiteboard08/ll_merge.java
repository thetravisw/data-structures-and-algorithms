package Whiteboard08;

import Whiteboard06_Append_LinkedLists.ListNode;

public class ll_merge {
    public static void main(String[] args) {
    }


    public static ListNode ll_merge_lists(ListNode a, ListNode b){
        a=a.root;
        b=b.root;
        ListNode results = a;
        results.link=b;
        results=results.link;

//        while (a.link != null || b.link != null ) {
            if (a.link != null) {
                results.link = a.link;
                a = a.link;
                results = results.link;
            }
            if (b.link != null) {
                results.link = b.link;
                b = b.link;
                results = results.link;
            }
//        }
        return results.root;
    }
}

