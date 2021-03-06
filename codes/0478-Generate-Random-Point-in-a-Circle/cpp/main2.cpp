class Solution
{
public:
    Solution(double radius, double x_center, double y_center)
    {
        r = radius;
        centerX = x_center;
        centerY = y_center;
    }

    vector<double> randPoint()
    {
        while (true)
        {
            double x = (2 * (double)rand() / RAND_MAX - 1.0) * r;
            double y = (2 * (double)rand() / RAND_MAX - 1.0) * r;
            if (x * x + y * y <= r * r)
                return {centerX + x, centerY + y};
        }
    }

private:
    double r, centerX, centerY;
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution* obj = new Solution(radius, x_center, y_center);
 * vector<double> param_1 = obj->randPoint();
 */