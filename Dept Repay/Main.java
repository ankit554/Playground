#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  cin>>p>>r>>t;
  float si,amt=0,dis,finalAmt;
  si=(p*r*t)/100;
  amt=p+si;
  dis=(si*2)/100;
  finalAmt=amt-dis;
  cout<<si<<"\n"<<amt<<"\n"<<dis<<"\n"<<finalAmt;
}