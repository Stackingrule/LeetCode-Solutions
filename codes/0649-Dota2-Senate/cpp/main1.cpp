class Solution {
public:
    string predictPartyVictory(string senate) {
        int n = senate.size(), cntR = 0, cntD = 0;
        for (char c : senate) {
            c == 'R' ? ++cntR : ++cntD;
        }
        if (cntR == 0) return "Dire";
        if (cntD == 0) return "Radiant";
        while (cntR > 0 && cntD > 0) {
            for (int i = 0; i < n; ++i) {
                if (senate[i] == 'R') {
                    for (int j = i + 1; j < i + n; ++j) {
                        if (senate[j % n] == 'D') {
                            senate[j % n] = 'B';
                            --cntD;
                            break;
                        }
                    }
                } else if (senate[i] == 'D') {
                    for (int j = i + 1; j < i + n; ++j) {
                        if (senate[j % n] == 'R') {
                            senate[j % n] = 'B';
                            --cntR;
                            break;
                        }
                    }
                }
            }
        }
        return cntR != 0 ? "Radiant" : "Dire";
    }
};