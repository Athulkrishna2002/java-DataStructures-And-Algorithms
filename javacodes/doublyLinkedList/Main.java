package javacodes.doublyLinkedList;

public class Main {
    public static void main(String []args){
        DoublyLinkedList dbl = new DoublyLinkedList(7);
        dbl.getHead();
        dbl.getTail();
        dbl.getLength();

        dbl.append(8);
        dbl.printList();
        System.out.println("Afetr inserting 6 in between");
        dbl.insert(1,6);
        System.out.println("removed item = "+dbl.removeLast().value);
        dbl.printList();
        dbl.prepend(9);
        dbl.printList();
        System.out.println("aftre removing 1st index value ");
        dbl.remove(1);
        dbl.printList();
        System.out.println("no. at index 1 = "+dbl.get(1).value);
        dbl.removeFirst();
        System.out.println("After removieng 0th element");
        dbl.printList();
        System.out.println("");
        System.out.println("After setting the value at 0");
        dbl.set(0,2);
        dbl.printList();
    }
}
