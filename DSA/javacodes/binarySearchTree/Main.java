package javacodes.binarySearchTree;

public class Main {
    public static void main(String []args){
        BinarySearchTree bst=new BinarySearchTree();
        System.out.println("root = "+bst.root);
        bst.insert(4);
        bst.insert(1);
        bst.insert(6);
        bst.insert(3);
        bst.insert(2);
        bst.insert(9);

        System.out.println(bst.contains(9));
        System.out.println(bst.contains(10));
        System.out.println(bst.root.left.right.value);

    }
}
