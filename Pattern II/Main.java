#include <iostream>
using namespace std;

int main() 
{
  int n,i,j,count=1;
  cin>>n;
  for(i=1; i<=n; i++)
  {
    for(j=1; j<=i; j++)
    {
      cout<<count;
      (i%2==0)?count--:count++;
      (i!=j)?cout<<"*":cout<<endl;
    }
    (i%2==0)?count+=i+1:count+=i;
  }
  return 0;
}