class Solution {
   public static boolean isFlipedString(String s1, String s2) {
        boolean result=false;
              if (s1.length()==0&&s2.length()==0||s1.equals(s2)){
                  result=true;
              }
              else if (s1.length()!=s2.length()){
                  result=false;
              }
              else {
    			for (int i = 0; i < s2.length(); i++) {
            		if (s2.charAt(i)==s1.charAt(s1.length()-1)&&s2.charAt(i+1)==s1.charAt(0)){
		                String substring1 = s2.substring(0,i+1);
		                String substring2 = s2.substring(i+1);
		                String s22=substring2+substring1;
		                if (s22.equals(s1)) {
                    		result= true;break;
                		}
            		}
        	}
    	}
   		return result;
    }
}
