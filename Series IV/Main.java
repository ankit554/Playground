#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,p=0,n2=2;
  cin>>n;
  if(n>0)
    cout<<p<<" ";
  for(int i=1;i<n;i++)
  {
    p=p+n2;
    cout<<p<<" ";
    if(i%2==1)
    	n2=n2+4;
  }
    
}