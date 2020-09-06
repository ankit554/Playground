#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,amt;
  cin>>n;
  if(n<=200)
  {
    amt=n*0.5;
  }
  else if(n<=400)
  {
    amt=(n*0.65)+100;
  }
  else if(n<=600)
  {
    amt=(n*0.8)+200;
  }
  else{
    amt=(n*1.25)+425;
  }
  cout<<"Rs."<<amt;
}