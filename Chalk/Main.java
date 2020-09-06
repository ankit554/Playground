#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,x,sum;
  cin>>n;
  x=n;
  sum=n;
  while(n>1)
  {
      if(n/sqrt(x)<1)
      {
          sum++;
          break;
      }
      n=n/sqrt(x);
      sum+=n;
      
  }
  cout<<sum;
}