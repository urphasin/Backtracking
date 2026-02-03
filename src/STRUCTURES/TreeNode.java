package STRUCTURES;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    /* CONSTRUCTOR */
    public TreeNode(int value) {
        this.left = null;
        this.right= null;
        this.value = value;
    }
    public TreeNode() {
        this.left = null;
        this.right= null;
        this.value = 0;
    }
    /* END CONSTRUCTOR */

    protected void Insert(int value) {
        if (value < this.value) {
            if (this.left == null) {
                this.left = new TreeNode(value);
            }
            else {
                this.left.value = value;
            }
        }
        else {
            if (this.right == null) {
                this.right = new TreeNode(value);
            }
            else {
                this.right.value = value;
            }
        }
    }


}
