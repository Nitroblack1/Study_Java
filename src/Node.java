public class Node {
    int value;
    Node left;
    Node right;

    public Node(int i)
    {
        value = i;
        left = null;
        right = null;
    }

    public Node getLeftChild(Node node) { return left; }
    public Node getRightChild(Node node) { return right; }
    public void setLeftChild(Node node) { left = node; }
    public void setRightChild(Node node) { right = node; }
}
