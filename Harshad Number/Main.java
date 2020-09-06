#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,r,sum=0,t;
  cin>>n;
  t=n;
  while(n>0)
  {
    r=n%10;
    sum+=r;
    n=n/10;
  }
  (t%sum==0) ? cout<<"Harshad Number" : cout<<"Not Harshad Number";
}