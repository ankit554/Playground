#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
    string s;
    getline(cin,s);
    int l=s.length(),count=9;
    for(int i=0;i<l;i++)
    {
        if(s[i]==' ')
        {
            count--;
        }
    }
    if(count>=0)
        cout<<"Caption eligible for the contest";
    else
     cout<<"Caption not eligible for the contest";
} 