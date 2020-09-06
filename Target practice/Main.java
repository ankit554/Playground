#include<iostream>
using namespace std;
int main()
{
  int n,x,y=0,count=0;
  cin>>n;
  while(y<n)
  {
    cin>>x;
    y+=x;
    count++;
  }
  cout<<"The number of turns is "<<count;
}