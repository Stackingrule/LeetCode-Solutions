/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        
        Map <Integer, Integer> sumsMap = new HashMap <> ();
        int [] highestFrequency = { 0 };
        List<Integer> result = new ArrayList <> ();
        
        findFrequentTreeSum (root, sumsMap, highestFrequency, result);
        
        System.out.println (result.toString());
        
        int[] res = new int[result.size()];
        int i = 0;
        for (int entry : result) {
            res [i++] = entry;
        }
        
        return  res;
    }
    
    private int findFrequentTreeSum (TreeNode root, 
                                     Map <Integer, Integer> sumsMap, 
                                     int [] highestFrequency, 
                                     List <Integer> result) {
        int sum = 0;
        if (root.left != null) {
            sum += findFrequentTreeSum (root.left, sumsMap, highestFrequency, result);
        }
        
        if (root.right != null) {
            sum += findFrequentTreeSum (root.right, sumsMap, highestFrequency, result);
        }
        
        sum += root.val;
        sumsMap.put (sum, sumsMap.getOrDefault (sum, 0) + 1);
        
        if (sumsMap.get (sum) > highestFrequency [0]) {
            result.clear ();
            highestFrequency [0] = sumsMap.get (sum);
            result.add (sum);
        } else if (sumsMap.get (sum) == highestFrequency [0]) {
            result.add (sum);
        }
        
        return sum;
    }
}