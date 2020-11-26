class Solution {
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> res = new ArrayList<>();
        if(A == null){
            return res;
        }

        int n = A.length;
        int largest = n;
        for(int i = 0; i<n; i++){
            int maxIndex = -1;
            int max = Integer.MIN_VALUE;

            for(int j = 0; j<largest; j++){
                if(A[j] >= max){
                    maxIndex = j;
                    max = A[j];
                }
            }

            swap(A, maxIndex);
            swap(A, largest-1);
            res.add(maxIndex + 1);
            res.add(largest--);
        }

        return res;
    }

    private void swap(int [] arr, int k){
        for(int i = 0, j = k; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}