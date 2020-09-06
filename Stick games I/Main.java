#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,res;
  cin>>a>>b;
  if(a<b)
    res=a;
  else
    res=b;
  (res%2==0) ? cout<<"Mani Iyer" : cout<<"Arun Gupta";
  return 0;
}