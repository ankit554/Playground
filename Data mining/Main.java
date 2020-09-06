#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,r,e=0,o=0,i=1;
  cin>>n;
  while(n>0)
  {
    if(i%2==0)
    {
      r=n%10;
      e+=r;
      i++;
    }
    else
    {
      r=n%10;
      o+=r;
      i++;
    }
    n=n/10;
  }
  (e==o) ? cout<<"Yes" : cout<<"No";
    
}