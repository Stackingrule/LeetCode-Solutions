class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum = sum / 3;
        int suma = A[0], sumc = A[A.length - 1];
        int i = 1, j = A.length - 2;
        while (i < j) {
            if (suma != sum) {
            suma += A[i++];
            }
            if (sumc != sum) {
            sumc += A[j--];
            }
            if (suma == sum && sumc == sum && i <= j) {
            return true;
            }
        }
        return false;
    }
}