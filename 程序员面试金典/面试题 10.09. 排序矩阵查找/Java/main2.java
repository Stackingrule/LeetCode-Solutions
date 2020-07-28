class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)return false;
          for(int j=matrix[0].length-1;j>=0;j--){
             if(matrix[0][j]>target)continue;
                   int x=0;
                   int end=matrix.length-1;
                   while(x<=end){
                       int mid=(x+end)/2;
                       if(matrix[mid][j]==target)return true;
                       else if(matrix[mid][j]>target)end=mid-1;
                       else
                    x=mid+1;
                   }
               }
           return false;
        }
}