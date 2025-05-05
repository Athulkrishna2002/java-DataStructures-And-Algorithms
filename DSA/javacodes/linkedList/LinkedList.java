package javacodes.linkedList;


import java.util.HashMap;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
        System.out.println(value);
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
        System.out.println(head);
    }

    public void printLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void appendList(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next = newNode;
            tail=newNode;
        }
        length++;

    }

    public Node removeLast(){

        if(length == 0){
           return null;
        }
           Node pre = head;
           Node temp = head;

           while(temp.next != null){
               pre = temp;
               temp = temp.next;
           }

           tail = pre;
           tail.next = null;

           length--;
            if(length == 0){
                head = null;
                tail = null;
            }
            return temp;


    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head=newNode;
            tail = newNode;

        }else{
            newNode.next=head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        Node temp= head;
        if (length == 0){
            return null;
        }else{
            temp = head;
            head = head.next;
            temp.next = null;
        }
        length -- ;
        if (length == 0){
            tail=null;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value=value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index >= length){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        }else if(index == length){
            appendList(value);
        }else{
            Node newNode = new Node(value);
            Node temp = get(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
        return false;
    }

    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        } else {
            Node prev = get(index - 1);
            Node temp = prev.next;

            prev.next = temp.next;
            temp.next = null;
            length--;
            return temp;

        }
    }
    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp=head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;
        for(int i=0;i<length;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }
    public void getHead(){
        System.out.println("Head "+head.value);
    }

    public void getTail(){
        System.out.println("Tail "+tail.value);
    }

    public void getLength(){
        System.out.println("Length "+length);
    }
}
