package homework_6.binary_tree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Node {

    private int data;
    private Node left;
    private Node right;

    Node(int d) {
        this.data = d;
        left = right = null;
    }
}

class Height {
    int height = 0;
}

class BinaryTree {

    private Node root;

    @SuppressWarnings("SuspiciousNameCombination")
    boolean checkHeightBalance(Node root, Height height) {

        if (root == null) {
            height.height = 0;
            return true;
        }

        Height leftHighlight = new Height(), rightHighlight = new Height();
        boolean left = checkHeightBalance(root.getLeft(), leftHighlight);
        boolean right = checkHeightBalance(root.getRight(), rightHighlight);
        int leftHeight = leftHighlight.height, rightHeight = rightHighlight.height;

        height.height = (Math.max(leftHeight, rightHeight)) + 1;

        if ((leftHeight - rightHeight >= 2) || (rightHeight - leftHeight >= 2))
            return false;

        else
            return left && right;
    }

    public static void main(String[] args) {
        Height height = new Height();

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.setLeft(new Node(2));
        tree.root.setRight(new Node(3));
        tree.root.getLeft().setLeft(new Node(4));
        tree.root.getLeft().setRight(new Node(5));
        tree.root.getRight().setRight(new Node(6));

        if (tree.checkHeightBalance(tree.root, height))
            System.out.println("The tree is balanced");
    }
}
