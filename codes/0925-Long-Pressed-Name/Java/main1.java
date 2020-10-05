class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(typed.length()< name.length())  return false; 
        if(typed.length() == name.length()) return typed.equals(name); 
        
        int nameIndex = 0;
        for(int i = 0; i< typed.length(); i++){
            if(nameIndex < name.length() && typed.charAt(i) == name.charAt(nameIndex)){
                nameIndex++;
            } else if(i>0 && typed.charAt(i) == typed.charAt(i-1)){
                continue;
            } else return false;
        }
        if(nameIndex == name.length())
            return true;
        else 
            return false;
    }
}