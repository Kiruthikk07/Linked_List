class LinkedList{
    Node head;
    LinkedList(){
        this.head = head;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void addAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addAtPosition(int data, int pos){
        if(pos == 1){
            addAtBeginning(data);
        }
        else{
            Node temp = head;
            Node newNode = new Node(data);
            for(int i = 1; i < pos - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    
    public void delete(){
        if(head.next == null){
            head = null;
        }
        else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    
    public void deleteAtBeginning(){
        head = head.next;
    }
    
    public void deleteAtPosition(int pos){
        if(pos == 1){
            deleteAtBeginning();
        }
        else{
            Node temp = head;
            for(int i = 1; i < pos - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    
    public void length(){
        Node temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        System.out.println(len);
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Linked_List_Implementation{
	public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.addAtBeginning(11);
	    list.deleteAtBeginning();
	    list.add(5);
	    list.addAtPosition(44,3);
	    list.deleteAtPosition(3);
	    list.display();
	    list.length();
	}
}
