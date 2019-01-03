package dsa.binarysearchtree;

// search O(log N)
// insert O(log N)

class BinarySearchTree {
    private Node root;

    BinarySearchTree() {
        root = null;
    }

    // ------------ insert --------------
    void insert(int value) {
        insertRecursively(root, value);
    }

    private void insertRecursively(Node current, int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        if (value <= current.data) {
            if (current.left == null) {
                current.left = new Node(value);
            } else {
                insertRecursively(current.left, value);
            }
        } else {
            if (current.right == null) {
                current.right = new Node(value);
            } else {
                insertRecursively(current.right, value);
            }
        }
    }

    // ------------ search --------------
    boolean search(int value) {
        return contains(root, value);
    }

    private boolean contains(Node current, int value) {
        if (value == current.data) {
            return true;
        } else if (value < current.data) {
            if (current.left == null) {
                return false;
            } else {
                return contains(current.left, value);
            }
        } else {
            if (current.right == null) {
                return false;
            } else {
                return contains(current.right, value);
            }
        }
    }

    // ------------ traverse - DFS - In-Order --------------
    void inOrder() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(Node current) {
        if (current == null) {
            return;
        }

        if (current.left != null) {
            inOrderTraversal(current.left);
        }

        System.out.print(current.data + " ");

        if (current.right != null) {
            inOrderTraversal(current.right);
        }
    }

    // ------------ traverse - DFS - Pre-Order --------------
    void preOrder() {
        preOrderTraversal(root);
        System.out.println();
    }

    private void preOrderTraversal(Node current) {
        if (current == null) {
            return;
        }

        System.out.print(current.data + " ");

        if (current.left != null) {
            preOrderTraversal(current.left);
        }

        if (current.right != null) {
            preOrderTraversal(current.right);
        }
    }

    // ------------ traverse - DFS - Post-Order --------------
    void postOrder() {
        postOrderTraversal(root);
        System.out.println();
    }

    private void postOrderTraversal(Node current) {
        if (current == null) {
            return;
        }

        if (current.left != null) {
            postOrderTraversal(current.left);
        }

        if (current.right != null) {
            postOrderTraversal(current.right);
        }

        System.out.print(current.data + " ");
    }

    // ------------ delete --------------
    void delete(int value) {
        if (root == null) {
            System.out.println("The tree is empty!");
            return;
        }

        if (!search(value)) {
            System.out.println("The number you are looking for is not in the Tree");
            return;
        }
        removeNode(root, value);
    }

    private Node removeNode(Node current, int value) {
        if (current.data == value) {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                    System.out.println("The root is deleted");
                }
                return null;
            } else if (current.left == null) {
                current = current.right;
                current.right = null;
            } else if (current.right == null) {
                current = current.left;
                current.left = null;
            } else {
                Node smallestNode = lookForSmallest(current.right);
                current.data = smallestNode.data;
                current.right = removeNode(current.right, smallestNode.data);
            }
            return current;
        }

        if (value < current.data) {
            current.left = removeNode(current.left, value);
        } else {
            current.right = removeNode(current.right, value);
        }









        return current;
    }

    private Node lookForSmallest(Node rightTree) {
        if (rightTree.left == null) {
            return rightTree;
        } else {
            return lookForSmallest(rightTree.left);
        }
    }
}
