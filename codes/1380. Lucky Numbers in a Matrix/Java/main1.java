class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
        var res = new ArrayList<Integer>();
        for (int i = 0; i < m.length; i++) {
            var minIdx = 0;
            for (int j = 1; j < m[0].length; j++) {
                if (m[i][j] < m[i][minIdx])
                    minIdx = j;
            }

            var isMax = true;
            for (int k = 0; k < m.length; k++) {
                if (m[k][minIdx] > m[i][minIdx]) {
                    isMax = false;
                    break;
                }
            }

            if (isMax)
                res.add(m[i][minIdx]);
        }

        return res;
    }}