class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] arr = a.split("\\+", -1);
        String[] brr = b.split("\\+", -1);

        int a0 = Integer.parseInt(arr[0]);
        int a1 = Integer.parseInt(arr[1].substring(0, arr[1].length() - 1));

        int b0 = Integer.parseInt(brr[0]);
        int b1 = Integer.parseInt(brr[1].substring(0, brr[1].length() - 1));

        int one = a0 * b0;
        int two = a0 * b1;
        int three = a1 * b0;
        int four = a1 * b1;

        StringBuilder sb = new StringBuilder();
        int real = one + four * -1;
        int imagine = two + three;
        sb.append(real).append("+").append(imagine).append("i");

        return sb.toString();
    }
}