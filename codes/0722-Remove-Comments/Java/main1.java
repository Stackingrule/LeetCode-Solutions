class Solution {
    public List<String> removeComments(String[] source) {
        // 将所有的字符串组合成一个完整的字符串用\n隔开，如果遇到//删除到\n为止，如果遇到/*删除到*/为止，最后根据\n进行分割
        StringBuilder total = new StringBuilder();
        List<String> res = new ArrayList<>();
        for(int i = 0; i < source.length; i++){
            total.append(source[i]).append("\n");
        }

        // 核心部分
        int i = 0;
        StringBuilder tmp = new StringBuilder();
        while(i < total.length() - 1){
            char firstChar = total.charAt(i);
            char secondChar = total.charAt(i + 1);
            if(firstChar == '/' && secondChar == '/'){
                // 跳过直到\n
                while(i < total.length() && total.charAt(i) != '\n') i++;
            }else if(firstChar == '/' && secondChar == '*'){
                // 先跳过/*，防止/*/的情况出现
                i = i + 2;
                // 跳过直到*/
                while(i < total.length() - 1 && !(total.charAt(i) == '*' && total.charAt(i + 1) == '/')) i++;
                // 跳过*/
                i = i + 2;
            }else {
                tmp.append(total.charAt(i++));
            }
        }

        // 将字符串转为数组
        String[] resArray = tmp.toString().split("\n");
        for(String str: resArray){
            if(!"".equals(str)) res.add(str);
        }
        return res;
    }
}