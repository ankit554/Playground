#include <iostream>
#include <string>
using namespace std;
int palin(string s1)
{
    int l=s1.length(),flag=1;
    for(int i=0;i<l;i++)
    {
        if(s1[i]!=s1[l-1-i])
        {
            flag=0;
            break;
        }
        else
            continue;
    }
    return flag;
}
int main() 
{
   	string s1;
   	getline(cin,s1);
   	cout<<palin(s1);
    return 0;
}