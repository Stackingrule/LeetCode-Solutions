class Solution {
public:
    bool CheckPermutation(string s1, string s2) {
        map<int,int> m1;
        map<int,int> m2;
        if(s1.length()>s2.length()){
        for(auto n:s1)
            m1[n]++;
        for(auto n:s2)
            m2[n]++;
        }
        else{
            for(auto n:s2)
                m1[n]++;
            for(auto n:s1)
                m2[n]++;
        }
        for(auto it=m1.begin();it!=m1.end();it++){
            if(m2[it->first]!=it->second)
                return false;
        }
        return true;
    }
};
