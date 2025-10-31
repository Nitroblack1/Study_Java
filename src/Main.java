//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

    }

    public void preOrderTraversal(Node n)
    {
        if (n == null) return;

        System.out.print(n.value+" ");
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
    }

    public void inOrderTraversal(Node n)
    {
        if (n == null) return;

        inOrderTraversal(n.left);
        System.out.print(n.value+" ");
        inOrderTraversal(n.right);
    }

    public  void postOrderTraversal(Node n)
    {
        if (n == null) return;

        postOrderTraversal(n.left);
        postOrderTraversal(n.right);
        System.out.print(n.value+" ");
    }
}