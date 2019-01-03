package dsa.binarysearchtree;

public class BSTMain {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5);
        tree.insert(1);
        tree.insert(3);
        tree.insert(8);
        tree.insert(6);
        tree.insert(7);


        System.out.println(tree.getHeight());
        tree.preOrder();
        tree.inOrder();
        tree.postOrder();

        System.out.println(tree.search(7));

        tree.delete(10);
        tree.delete(5);

        System.out.println();

        tree.preOrder();
        tree.inOrder();
        tree.postOrder();

        BinarySearchTree newTree = new BinarySearchTree();
        newTree.insert(5);
        newTree.inOrder();
        newTree.delete(5);
        newTree.inOrder();
        newTree.delete(10);
    }
}
