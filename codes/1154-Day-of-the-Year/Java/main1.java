class Solution {
    public int dayOfYear(String date) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30}, year = Integer.parseInt(date.substring(0, 4)), month = Integer.parseInt(date.substring(5, 7)), day = Integer.parseInt(date.substring(8, 10));
        for (int i = 0; i < month - 1; i++) day += days[i];
        return year != 1900 && year % 4 == 0 && month > 2 ? ++day : day;
    }
}