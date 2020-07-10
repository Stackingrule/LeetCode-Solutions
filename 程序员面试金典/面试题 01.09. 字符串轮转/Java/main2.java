class Solution {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length()!=s2.length()){ return false;} //两个字符串长度不一样一定不是旋转
        if(s1.equals(s2)){return true;}//如果两个字符串相等，也可以是旋转后等到的
        return (s1+s1).contains(s2);//把s1连接两次，判断连接后的字符串是否包含了s2。如果包含说明旋转
    
	}
}