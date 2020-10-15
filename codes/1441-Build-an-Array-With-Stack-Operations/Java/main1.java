class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result=new ArrayList<String>();
        for(int i=0,j=1;i<target.length;){
            if(target[i]==j){
                i++;
                j++;
                result.add(new String("Push"));
            }else{
                j++;
                result.add(new String("Push"));
                result.add(new String("Pop"));
                
            }
        }
        return result;
    }
}