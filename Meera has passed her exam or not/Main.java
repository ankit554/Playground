#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n],x,flag=0;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>x;
  for(int j=0;j<n;j++)
  {
    if(a[j]==x)
      flag=1;
  }
  (flag==1) ? cout<<"She passed her exam" : cout<<"She failed";
}