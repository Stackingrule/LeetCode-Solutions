class Solution {
public:
    bool isNumber(string s) {
        int flag=0;
        if(s=="") return false;
        while(s[0]==' ') s=s.substr(1);
        if(s[0]=='+'||s[0]=='-') s=s.substr(1);
        while(((s[0]-'0')>=0) && ((s[0]-'0')<=9)){
            s=s.substr(1);flag=1; 
        } 
        if(s[0]=='.'){
            s=s.substr(1);
            while(((s[0]-'0')>=0) && ((s[0]-'0')<=9)){
                s=s.substr(1);flag=1; 
            }
        }
        if(flag==0) return false;
        flag=0;
        if(s[0]=='e'||s[0]=='E'){
            s=s.substr(1);
            if(s[0]=='+'||s[0]=='-') s=s.substr(1);           
            while(((s[0]-'0')>=0) && ((s[0]-'0')<=9)){
                s=s.substr(1);flag=1; 
            }
            if(flag==0) return false;     
        }
        while(s[0]==' ') s=s.substr(1);
        if(s=="") return true;
        return false;
    }
};

