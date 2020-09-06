#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,sum=0;
  cin>>a>>b;
  for(int i=0;i<a;i++)
  {
    int x;
    cin>>x;
    sum+=x;
  }
  (sum<=b) ? cout<<"YES" : cout<<"NO";
}