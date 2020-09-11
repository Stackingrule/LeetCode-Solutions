class Solution {
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        for(String s:ops){
            int n = list.size();
            if(s.equals("+")){
                list.add(list.get(n-1) + list.get(n-2));
            }else if(s.equals("D")){
                list.add(2 * (int)list.get(n-1));
            }else if(s.equals("C")){
                list.remove(n-1);
            }else{
                list.add(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for(int i:list)
            sum += i;
        return sum;
    }
}
