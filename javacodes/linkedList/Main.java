package javacodes.linkedList;

public class Main {
    public static void main(String[] args){
        LinkedList newLinkedList = new LinkedList(7);
        newLinkedList.appendList(8);
        newLinkedList.prepend(9);
//        newLinkedList.removeFirst();
        newLinkedList.printLinkedList();
//        System.out.println(newLinkedList.removeFirst().value);
//        System.out.println(newLinkedList.removeFirst().value);
//        newLinkedList.get(2);
        System.out.println("node at index "+newLinkedList.get(1).value);
        newLinkedList.set(1,2);
//        newLinkedList.getHead();
//        newLinkedList.getTail();
//        newLinkedList.getLength();
//        newLinkedList.removeLast(7);
        newLinkedList.printLinkedList();
        newLinkedList.insert(1,5);
        System.out.println("new list after inserting = ");
        newLinkedList.printLinkedList();
        newLinkedList.remove(2);
        System.out.println("new list after removing = ");
        newLinkedList.printLinkedList();
        newLinkedList.reverse();
        System.out.println("new list after reverse = ");
        newLinkedList.printLinkedList();

    }
}
