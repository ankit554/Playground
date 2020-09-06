#include<iostream>
using namespace std;
int cal(int n)
{
  int sum=0;
  while(n>0)
  {
    int r=n%10;
    sum=sum+r;
    n=n/10;
  }
  if(sum>9)
    return cal(sum);
  else
    return sum;
}
int main()
{
  int n;
  cin>>n;
  cout<<cal(n);
}