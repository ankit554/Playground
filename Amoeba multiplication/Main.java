#include<iostream>
using namespace std;
int find(int n)
{
  if(n==1)
    return 0;
  if(n==2)
    return 1;
  return find(n-1)+find(n-2);
}
int main()
{
  int n;
  cin>>n;
  int res=find(n);
  cout<<res;
}