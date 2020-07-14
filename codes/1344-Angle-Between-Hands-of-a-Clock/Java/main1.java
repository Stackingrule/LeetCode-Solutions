class Solution {
    public double angleClock(int hour, int minutes) {
        double a_m = minutes * 360 / 60;
        double a_h = (hour + minutes / 60.0) * 360 / 12;
        return Math.min(Math.abs(a_h - a_m), 360 - Math.abs(a_m - a_h));
    }
}