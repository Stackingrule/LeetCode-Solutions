class MyCalendar {

    private List<int[]> cal;

    public MyCalendar() {
        cal = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for (int[] a : cal) {
            if (a[0] < end && start < a[1]) return false;
        }
        cal.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */