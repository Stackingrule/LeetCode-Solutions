class Solution
{
public:
    char slowestKey(vector<int> &releaseTimes, string keysPressed)
    {
        int n = releaseTimes.size();
        int maxTime = releaseTimes[0];
        char maxChar = keysPressed[0];
        for (int i = 1; i < n; ++i)
        {
            int time = releaseTimes[i] - releaseTimes[i - 1];
            if (time > maxTime)
            {
                maxTime = time;
                maxChar = keysPressed[i];
            }
            else if (time == maxTime)
            {
                maxChar = keysPressed[i] > maxChar ? keysPressed[i] : maxChar;
            }
        }
        return maxChar;
    }
};