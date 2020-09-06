#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
    string s;
    getline(cin,s);
    int l=s.length();
    string r="";
    for(int i=0;i<l;i++){
        if(((int)s[i]>=65 && (int)s[i]<=91) || ((int)s[i]>=97 && (int)s[i]<=122))
            r+=s[i];
    }
    cout<<r;
} 