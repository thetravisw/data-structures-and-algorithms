package Whiteboard11_queue_with_stacks;

public class DataNode{

    public void add (int data){
        DataNode datanode = new DataNode(data);
        if (this.head == null){
            this.head=datanode;
        }
        else{
            this.tail.link=datanode;
        }
        this.tail=datanode;
    }

    public int remove (){
        int data=this.head.data;
        this.head=this.head.link;
        return data;
    }

    //Constructor for Datanodes, and their properties.

    public int data;
    public DataNode link;
    public DataNode head;
    public DataNode tail;


    public DataNode (int d) {
        data = d;
        link = null;
        head = this;
        tail = this;
    }

}
