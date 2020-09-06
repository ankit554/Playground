#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
    string s;
    getline(cin,s);
    int l=s.length(),flag=1;
    string r;
    getline(cin,r);
    for(int i=0;i<l;i++){
        if(s[i]!=r[i])
            flag=0;
    }
    if(flag==1)
        cout<<"It is correct";
    else
        cout<<"It is wrong";
} 