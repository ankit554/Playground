#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
    string s;
    getline(cin,s);
    int l=s.length();
    string r="";
    for(int i=l-1;i>=0;i--){
        r+=s[i];
    }
    cout<<r;
    return 0; 
} 