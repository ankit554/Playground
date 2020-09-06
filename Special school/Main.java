#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
    string s,r1;
    getline(cin,s);
  getline(cin,r1);
    int l=s.length();
    string r="";
    for(int i=l-1;i>=0;i--){
        r+=s[i];
    }
    if(r==r1)
        cout<<"It is correct";
    else
        cout<<"It is wrong";
    return 0; 
} 