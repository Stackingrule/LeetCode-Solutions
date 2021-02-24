import java.util.Deque;

class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        Deque<Integer> stack = new LinkedList<>();
        for (int a : arr) {
            stack.push(a);
            if (a == 0) stack.push(a);

            if (stack.size() >= n)
                break;
        }
        if (stack.size() > n) stack.pop();
        int i = n - 1;
        while (stack.size() > 0) {
            arr[i--] = stack.pop();
        }
    }
}