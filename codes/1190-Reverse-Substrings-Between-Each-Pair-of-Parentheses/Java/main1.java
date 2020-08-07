class Solution 
{
    public String reverseParentheses(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray())
        {
            if( c == ')')
            {
                Queue<Character> queue = new LinkedList<>();
                while(!stack.isEmpty() && stack.peek() != '(') 
                {
                    queue.add(stack.pop());
                }
                if(!stack.isEmpty()) 
                {
                    stack.pop();
                }
                while(!queue.isEmpty()) 
                {
                    stack.push(queue.remove());
                }
            } 
            else 
            {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) 
        {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}