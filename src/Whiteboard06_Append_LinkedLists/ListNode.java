package Whiteboard06_Append_LinkedLists;

class ListNode
{
    public static void main(String[] args) {


        //Testing {
            ListNode TestList = new ListNode(22, null);
            TestList.Append(7);
            TestList.Append(153);

            TestList.InsertBefore(153, 14);
            TestList.InsertBefore(14, 65);

            TestList.InsertAfter(22, 3);

            TestList.DeleteNode(22);
            TestList.DeleteNode(153);

            //Print List
            ListNode current = TestList.root;
            while (current.link != null){
                System.out.print(current.data + "---->");
                current=current.link;
            }
            System.out.println(current.data);

        // }   End Testing   Expected result: 3, 7, 65, 14
    }

    protected int data;
    protected ListNode link;
    protected ListNode root=this;

    //Constructor to Build nodes
    public ListNode(int d, ListNode n)
    {
        data = d;
        link = n;
    }

    //Constructor I'm actually using.
    public ListNode (int d){
        data = d;
        link = null;
    }


    public void Append(int value){
        ListNode appendedNode = new ListNode(value);  ///*
        ListNode current = this.root;
        while (current.link !=null){
            current = current.link;
        }
        current.link = appendedNode;
    }

    public void InsertBefore(int TargetValue, int InsertedValue){
        //  If target value isn't in the list, automatically append to the end
        ListNode appendedNode = new ListNode(InsertedValue); ///*
        ListNode current = this.root;
        while ( current.link != null && current.link.data != TargetValue){
            current = current.link;
        }
        appendedNode.link = current.link;
        current.link = appendedNode;
    }

    public void InsertAfter (int TargetValue, int InsertedValue){
        //  If target value isn't in the list, automatically append to the end
        ListNode appendedNode = new ListNode(InsertedValue);   //*
        ListNode current = this.root;
        while (current.link!=null && current.data != TargetValue){
            current = current.link;
        }
        appendedNode.link = current.link;
        current.link = appendedNode;
    }

    public void DeleteNode (int TargetValue){
        ListNode current = this.root;
        if (current.data==TargetValue) {
            this.root=current.link;}
        else{
            while (current.link != null && current.link.data != TargetValue){
                current = current.link;
            }
            current.link = current.link.link;
        }
    }
}