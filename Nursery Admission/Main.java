#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
    string s;
    getline(cin,s);
    int l=s.length();
    cout<<"The number of letters in the name is "<<l;
    return 0; 
} 