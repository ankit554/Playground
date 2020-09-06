#include<iostream>
using namespace std;
int main()
{
  float a,b,c,d;
  cin>>a>>b>>c>>d;
  float x=b+d;
  float y=a+c;
  if(x>=12)
  {
    x-=12;
    y++;
  }
  cout<<y<<"\'-"<<x<<"\"";
}