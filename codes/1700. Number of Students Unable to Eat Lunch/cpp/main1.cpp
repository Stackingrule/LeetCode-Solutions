class Solution
{
public:
    int countStudents(vector<int> &students, vector<int> &sandwiches)
    {
        stack<int> sandwich_stack;

        for (int i = sandwiches.size() - 1; i >= 0; i--)
        {
            sandwich_stack.push(sandwiches[i]);
        }

        queue<int> student_queue;
        for (int i : students)
        {
            student_queue.push(i);
        }

        int count = 0;
        while (!student_queue.empty())
        {
            int curr = student_queue.front();
            student_queue.pop();

            if (curr == sandwich_stack.top())
            {
                sandwich_stack.pop();
                count = 0;
            }
            else
            {
                student_queue.push(curr);
                count++;
            }

            if (count > student_queue.size())
                break;
        }

        return sandwich_stack.size();
    }
};