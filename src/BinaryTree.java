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

    public Node delete(int i) { return null; }

    public Node find(int i) { return null; }
}