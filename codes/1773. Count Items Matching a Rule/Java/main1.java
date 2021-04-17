class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int index=0;
        switch(ruleKey){
            case "color": {index=1; break;}
            case "type": {index=0; break;}
            case "name":{index=2;break;}
        }
        for(List<String> i:items){
            if(i.get(index).equals(ruleValue)) count++;
        }
        return count;
    }
}