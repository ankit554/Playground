#include <iostream>
#include <string>
using namespace std;
string ds(string s1,string s2)
{
  	int l=s1.length();
	string p="";
  	for(int i=0;i<l;i++)
    {
      	if(s1[i]!=s2[0])
          	p+=s1[i];
    }
  	return p;
}
int main() 
{
   	string s1,s2;
  	getline(cin,s1);
  	cin>>s2;
  	string ans=ds(s1,s2);
  	cout<<ans;
    return 0;
}