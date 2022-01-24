import javax.lang.model.element.Element;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int Element){
        this.data = Element;
        left = right = null;
    }
    public void insert(int element){
        if(element < data){
            if(left == null){
                left = new TreeNode(element);
            }
            else{
                left.insert(element);
            }
        }
        else{
            if(right == null){
                right = new TreeNode(element);
        }
            else{
                right.insert(element);
            }
        }
    }
}
class BST{
    TreeNode root;
    public void insert(int element){
        if(root == null){
            root = new TreeNode(element);
        }
        else{
            root.insert(element);
        }
    }
    public void inOrder (TreeNode t){
        if (t != null) {
            inOrder(t.left);
            System.out.print(t.data + " ");
            inOrder(t.right);
        }
    }
    public void delete (int value){
        root = delete(root, value);
    }
    public TreeNode delete(TreeNode t, int value){
        if(t == null){
            return null;
        }
        if(value < t.data){
            t.left = delete(t.left, value);
        }
        else if (value > t.data) {
            t.right = delete(t.right, value);
        }
        else {
            if (t.left == null) {
                return t.right;
            }
            else if (t.right == null) {
                return t.left;
            }

            t.data = minValue(t.right);

            t.right = delete(t.right, t.data);
        }
        return t;
    }
    public int minValue(TreeNode t)
    {
        int minv = t.data;
        while (t.left != null)
        {
            minv = t.left.data;
            t = t.left;
        }
        return minv;
    }
    public boolean isPresent(int value){
        return isPresent(root, value);
    }
    public boolean isPresent(TreeNode t,int value){
        boolean b = false;
        if(t == null){
            return false;
        }
        if(value < t.data){
            b = isPresent(t.left, value);
        }
        else if(value > t.data){
            b = isPresent(t.right, value);
        }
        else if(value == t.data){
            return true;
        }
        return b;
    }
    public boolean isBST(TreeNode t){
            if (t == null)
                return true;

            if (t.left != null && t.left.data > t.data) {
                return false;
            }

            if (t.right != null && t.right.data < t.data) {
                return false;
            }

            if (!isBST(t.left) || !isBST(t.right)){
                return false;
            }
            return true;
        }

}

public class BinarySearchTree {
    public static void main(String[] args) {
        BST intTree = new BST();
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(25);
        intTree.insert(17);
        intTree.insert(89);
        intTree.insert(27);
        intTree.insert(10);
        intTree.insert(24);
        intTree.inOrder(intTree.root);
        System.out.println();
        System.out.println("Delete 89 from BST :- ");
        intTree.delete(89);
        intTree.inOrder(intTree.root);
        System.out.println();
        System.out.println("Delete 20 from BST :- ");
        intTree.delete(20);
        intTree.inOrder(intTree.root);
        System.out.println();
        System.out.println("Is value 10 present in BST :- " + intTree.isPresent(10));
        System.out.println("Is value 20 present in BST :- " + intTree.isPresent(20));
        BST tree = new BST();
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        System.out.println("is tree a binary search tree :- " + tree.isBST(tree.root));
        System.out.println("Inorder traversal of entered tree :- ");
        tree.inOrder(tree.root);
    }
}
