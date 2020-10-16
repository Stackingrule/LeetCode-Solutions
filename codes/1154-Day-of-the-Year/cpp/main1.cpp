class Solution
{
public:
    int dayOfYear(string date)
    {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30}, year = atoi(date.substr(0, 4).c_str()), month = atoi(date.substr(5, 2).c_str()), day = atoi(date.substr(8, 2).c_str());
        for (int i = 0; i < month - 1; i++)
            day += days[i];
        return year != 1900 && year % 4 == 0 && month > 2 ? ++day : day;
    }
};