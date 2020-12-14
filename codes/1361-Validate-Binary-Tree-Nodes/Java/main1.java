class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] indegree =  new int[n];
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (leftChild[i] > -1) {
                m++;
                indegree[leftChild[i]]++;
            }

             if (rightChild[i] > -1) {
                m++;
                indegree[rightChild[i]]++;
            }
        } 

        if (m != n - 1)
            return false;
 
     

         for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                rt = i;
            else if (indegree[i] > 1)
                return false;
        }

        return dfs(rt, leftChild, rightChild) == n;
    } 

    private int dfs(int x, int[] leftChild, int[] rightChild) {
        if (x == -1) return 0;
        return dfs(leftChild[x], leftChild, rightChild)
             + dfs(rightChild[x], leftChild, rightChild)
             + 1;
    }
}