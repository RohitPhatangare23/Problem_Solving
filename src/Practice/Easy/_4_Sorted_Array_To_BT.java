package Practice.Easy;

import java.util.Arrays;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class _4_Sorted_Array_To_BT {


    public static void main(String[] args) {
        int[] arr={-10,-3,0,5,9};
        TreeNode result=sortedBT(arr);
        System.out.println(Arrays.toString(new TreeNode[]{result}));
    }

    public static TreeNode sortedBT(int[] nums) {
        return CreateBST(nums, 0, nums.length - 1);
    }

    private static TreeNode CreateBST(int nums[], int l, int r) {
        if (l > r) { // Base Condition or Recursion Stoping Condition
            return null;
        }
        // so basically in this question we have to convert sorted array to height
        // balanced tree
        // so if we directly create tree in given sorted order it will become linked
        // list
        // so we have to take middle element as head value such it will become height
        // balanced tree
        int mid = l + (r - l) / 2; // this is the formula to find mid value
        TreeNode root = new TreeNode(nums[mid]); // mid value or median
        root.left = CreateBST(nums, l, mid - 1); // assign the value for left of subtree that is l to mid -1 for given
        // array
        root.right = CreateBST(nums, mid + 1, r); // assign the value for right go subtree that is mid+1 to r for given
        // array
        return root;
    }
}
