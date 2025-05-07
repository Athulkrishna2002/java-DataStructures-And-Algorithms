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
        System.out.println("bst.root.right.value "+bst.root.right.value);
        System.out.println("bst.root.left.right.value "+bst.root.left.right.value);

        System.out.println("\nBst Contains 6:");
        System.out.println(bst.rContains(6));

        System.out.println("\nBst Contains 45:");
        System.out.println(bst.rContains(45));

        bst.rInsert(7);

        System.out.println("mininmum value from root = "+bst.minValue(bst.root));
        System.out.println("mininmum value from root.right = "+bst.minValue(bst.root.right));

        bst.deleteNode(6);
        System.out.println("after deleting bst.root.right.value "+bst.root.right.value);
    }
}
