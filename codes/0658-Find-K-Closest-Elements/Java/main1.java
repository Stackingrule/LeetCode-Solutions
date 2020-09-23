class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int upperIdx = firstEqualOrGreater(arr, x);
        int lowerIdx = upperIdx-1;
        List result = new ArrayList();
        for(int i=k;i>0;i--){
            if(lowerIdx<0)
                result.add(arr[upperIdx++]);
            else if(upperIdx>=arr.length)
                result.add(arr[lowerIdx--]);
            else if(x-arr[lowerIdx]<=arr[upperIdx]-x)
                result.add(arr[lowerIdx--]);
            else
                result.add(arr[upperIdx++]);
            
        }
        Collections.sort(result);
        return result;
    }

    public int firstEqualOrGreater(int[] a, int key){
        int lo = 0, hi = a.length-1;
        while(lo<=hi){
            int mid =  lo + (hi - lo) / 2;
            if(a[mid]<key)
                lo = mid+1;
            else
                hi = mid-1;
        }
        return lo;
    }
}