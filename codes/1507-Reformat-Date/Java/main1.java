class Solution {
    public String reformatDate(String date) {
        //if(date.equals("") || date == null) return "";
        String[] dat = date.split(" ");
        Map<String, String> map = new HashMap();
        map.put("Jan", "01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");
        StringBuilder sb = new StringBuilder();
        char[] day = dat[0].toCharArray();
        String mon = dat[1];
        String yea = dat[2];
        
        sb.append(yea).append("-");
        sb.append(map.get(mon)).append("-");
        int i = 0;
        int cur = 0;
        while(Character.isDigit(day[i])){
            cur = 10 * cur + (day[i] - '0');
            i++;
        }
        if(cur < 10) sb.append(0);
        sb.append(cur);
        return sb.toString();
    }
}