#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n,e=0,o=0,x;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>x;
    if(x<0)
      ((abs(x))%2==0) ? e+=x : o+=x;
    else
      (x%2==0) ? e+=x : o+=x;
  }
  cout<<"The sum of the even numbers in the array is "<<e<<endl;
  cout<<"The sum of the odd numbers in the array is "<<o;
}