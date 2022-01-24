class Key{
    Object data;
    Key left;
    Key right;

    public Key(Object element){
        this.data = element;
        left = right = null;
    }
}
class BinaryTree {
    Key root = null;
        public void preOrder (Key t){
            if (t != null) {
                System.out.print(t.data + " ");
                preOrder(t.left);
                preOrder(t.right);
            }
        }
        public void inOrder (Key t){
            if (t != null) {
                inOrder(t.left);
                System.out.print(t.data + " ");
                inOrder(t.right);
            }
        }
        public void postOrder (Key t){
            if (t != null) {
                postOrder(t.left);
                postOrder(t.right);
                System.out.print(t.data + " ");
            }
        }
    }
public class Application_5 {
    public static void main(String[] args) {
        BinaryTree bin = new BinaryTree();
        bin.root = new Key("a");
        bin.root.left = new Key("b");
        bin.root.right = new Key("c");
        bin.root.left.left = new Key("d");
        bin.root.left.right = new Key("e");
        bin.root.right.left = new Key("f");
        bin.root.right.right = new Key("g");
        bin.root.left.left.left = new Key("h");
        bin.root.left.left.right = new Key("i");
        bin.root.left.right.left = new Key("j");
        System.out.println("Inorder Traversal :- ");
        bin.inOrder(bin.root);
        System.out.println();
        System.out.println("Preorder Traversal :- ");
        bin.preOrder(bin.root);
        System.out.println();
        System.out.println("Postorder Traversal :- ");
        bin.postOrder(bin.root);
    }
}
