public class BinaryTree {
    Node root;

    public BinaryTree() { root = null; }

    public void insert(int i) {
        root = recursiveInsert(root, i);
    }

    private Node recursiveInsert(Node n, int i) {
        if (n == null) return new Node(i);

        if (i < n.value) {
            n.left = recursiveInsert(n.left, i);
        } else {
            n.right = recursiveInsert(n.right, i);
        }
        return n;
    }

    public void delete(int i) {
        root = recursiveRemove(root, i);
    }

    private Node recursiveRemove(Node n, int i) {
        if (n == null) return null;
        if (i < n.value) {
            n.left = recursiveRemove(n.left, i);
            return n;
        } else if (i > n.value) {
            n.right = recursiveRemove(n.right, i);
            return n;
        } else {
            if (n.left == null && n.right == null) {
                return null;
            } else if (n.left != null && n.right == null) {
                return n.left;
            } else if (n.left == null && n.right != null) {
                return n.right;
            } else {
                Node maxLeft = findMax(n.left);
                recursiveRemove(n.left, maxLeft.value);
                maxLeft.left = n.left;
                maxLeft.right = n.right;
                return maxLeft;
            }
        }
    }

    private Node findMax(Node n) {
        while (n.right != null) {
            n = n.right;
        }
        return n;
    }
}