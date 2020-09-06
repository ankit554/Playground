#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
    int f=1;
    string p;
    do
    {
        string s;
        cin>>s;
        p=s;
        int l=s.length();
        char z;
        if(f==1 || s[0]==z)
        {
            cout<<s<<endl;
            z=s[l-1];
            f=0;
        }
        else{
            break;
        }
    }while(p!="####");
}