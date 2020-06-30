class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // 模拟栈
        Stack<Integer> stack = new Stack<>();
        // 出栈下标
        int popIndex = 0;
        // 遍历入栈序列
        for (int i = 0; i < pushed.length; i++) {
            // 先让当前数字入栈
            stack.push(pushed[i]);
            // 遍历栈
            while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                popIndex++;
                stack.pop();
            }
        }

        return popIndex == pushed.length;
    }
}