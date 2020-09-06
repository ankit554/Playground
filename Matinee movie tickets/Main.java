#include<iostream>
using namespace std;
int main()
{
    int a;
    float b,x;
    cin>>a>>b;
  	x=13.30;
    cout<<"$";
    if(b==x)
    {
        if(a<13)
            cout<<"2.00";
        else
            cout<<"5.00";
    }
    else
    {
        if(a<13)
            cout<<"4.00";
        else
            cout<<"8.00";
    }
    return 0;
}