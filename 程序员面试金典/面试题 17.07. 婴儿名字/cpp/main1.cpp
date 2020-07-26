class Solution {
public:
	map<string, int> m_name_fre;
	map<string, string> m_parrent;
	string find(string name)//查操作，通过循环迭代一直查到祖先
	{	
		while (m_parrent.at(name) != name)
		{
			name=m_parrent.at(name);
		}
		return name;
	}
	void m_union(string name1, string name2)//并操作，获取两个名字的祖先，把字典序高的祖先作为低的祖先的儿子，并且字典序低的增加相应频率
	{
		string n1=find(name1);
		string n2=find(name2);
		if (n1 != n2)
		{
			//字典序比较
			if (n1<n2)
			{
				m_name_fre[n1]+=m_name_fre[n2];
				m_parrent[n2] = n1;
			}
			else
			{
				m_name_fre[n2] += m_name_fre[n1];
				m_parrent[n1] = n2;
			}
		}
	}
	vector<string> trulyMostPopular(const vector<string>& names, vector<string>& synonyms) {
		//初始化，将每个被使用的名字和其频率加入map
		for (auto& name : names)
		{
			auto pos=name.find('(');
			string nm=name.substr(0,pos);
			string fre=name.substr(pos+1,name.size()-pos-2);
			int ifre=stoi(fre);
			m_name_fre[nm]=ifre;
			m_parrent[nm]=nm;
		}
		//对每个共同使用的名字对，进行并组操作
		for (auto& name : synonyms)
		{
			auto pos=name.find(',');
			string n1=name.substr(1,pos-1);
			string n2=name.substr(pos+1, name.size() - pos - 2);
			if(m_name_fre.count(n1)==0||m_name_fre.count(n2)==0)//如果有一个名字并没有被使用则不统计
				continue;
			m_union(n1,n2);
		}
		//保存结果
		vector<string> result;
		for (auto& name :m_parrent)
		{
			if (name.first==name.second)
			{
				string fre=to_string(m_name_fre[name.first]);
				result.push_back(name.first+"("+fre+")");
			}
		}
		return result;
	}
};
