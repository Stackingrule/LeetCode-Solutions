/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        while (true) {
            int a = rand7(), b = rand7();
            int num = (a - 1) * 7 + b;
            if (num <= 40)
                return num % 10 + 1;
            a = num - 40;
            b = rand7();
            num = (a - 1) * 7 + b;
            if (num <= 60)
                return num % 10 + 1;
            a = num - 60;
            b = rand7();
            num = (a - 1) * 7 + b;
            if (num <= 20)
                return num % 10 + 1;
        }
    }
}