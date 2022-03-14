import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.LinkedList;

public class Tree {
    public static boolean isBST(DoubleLinkedListNode root) {

        if (root == null)
            return true;

        if (root.left != null && root.data < root.left.data) {
            return false;
        }

        if (root.right != null && root.data > root.right.data) {
            return false;
        }

        if(!isBST(root.left) || !isBST(root.right)){
            return false;
        }

        return true;
    }
    //https://practice.geeksforgeeks.org/problems/print-bst-elements-in-given-range/1
    static void PrintNodeFromRangeLowToHigh(DoubleLinkedListNode node, int k1, int k2) {
        if(node == null)
            return;
        if(k1< node.data){
            PrintNodeFromRangeLowToHigh(node.left, k1,k2);
        }

        if(k1<= node.data && node.data <=k2){
            System.out.println(node.data);
        }

        PrintNodeFromRangeLowToHigh(node.right, k1, k2);
    }
    // https://practice.geeksforgeeks.org/problems/root-to-leaf-path-sum/1
    boolean hasPathSum(DoubleLinkedListNode root, int S) {
        boolean ans = false;
        int subSum = S - root.data;
        if(subSum == 0 && root.left == null && root.right == null){
            ans = true;
            return ans;
        }
        if(root.left != null){
            ans = ans || hasPathSum(root.left, subSum);
        }
        if(root.right !=  null){
            ans = ans || hasPathSum(root.right, subSum);
        }
        return  ans;
    }

    int heightOfATree(DoubleLinkedListNode node){
        if(node == null)
            return 0;
        else {
            int leftHeight = heightOfATree(node.left);
            int rightHeight = heightOfATree(node.right);
            if(leftHeight > rightHeight){
                return leftHeight+1;
            }else {
                return rightHeight +1;
            }
        }
    }

    void printNodeAtDistanceKFromRoot(DoubleLinkedListNode root, int k){
        if(root == null || k<0)
            return;
        if(k == 0){
            System.out.println(root.data);
        }
        printNodeAtDistanceKFromRoot(root.left, k-1);
        printNodeAtDistanceKFromRoot(root.right, k-1);
    }

    void levelOrderTraversal(DoubleLinkedListNode node){
        Queue<DoubleLinkedListNode> queue = new LinkedList<>();
        if(node != null){
            queue.add(node);
        }

        while (!queue.isEmpty()){
            DoubleLinkedListNode node1 = queue.poll();
            System.out.println(node1.data);

            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
    }

    void levelOrderTraversalX(DoubleLinkedListNode node){
        Queue<DoubleLinkedListNode> queue = new LinkedList<>();
        if(node != null){
            queue.add(node);
        }

        while (!queue.isEmpty()){
            DoubleLinkedListNode node1 = queue.poll();
            System.out.println(node1.data);

            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
    }
    ArrayList<Integer> list;
    public List<Integer> getAllElements(DoubleLinkedListNode root1, DoubleLinkedListNode root2) {
        list = new ArrayList<>();
        traverseNode(root1);
        traverseNode(root2);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return list;
    }

    private void traverseNode(DoubleLinkedListNode root) {
        if(root != null){
            list.add(root.data);
            traverseNode(root.left);
            traverseNode(root.right);
        }
    }
}
