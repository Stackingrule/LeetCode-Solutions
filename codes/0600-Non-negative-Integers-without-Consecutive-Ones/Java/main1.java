class Solution {
    public int findIntegers(int num) {
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(num)).reverse();
        int n=sb.length();
        int []a=new int[n];//0結尾
        int []b=new int[n];//1結尾
        a[0]=1;
        b[0]=1;
        for(int i=1;i<n;i++){
            a[i]=a[i-1]+b[i-1];
            b[i]=a[i-1];
        }
        int ans=a[n-1]+b[n-1];
        for(int i=n-2;i>=0;i--){
            if(sb.charAt(i)=='0'&&sb.charAt(i+1)=='0'){
                ans-=b[i];
            }else if(sb.charAt(i)=='1'&&sb.charAt(i+1)=='1'){
                break;
            }
        }
        return ans;
    }
}