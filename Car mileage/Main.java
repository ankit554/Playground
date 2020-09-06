#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int p,d;
  cin>>m>>p>>d;
  if(m<((float)d/p))
    	cout<<"Cannot reach";
  else
    	cout<<"Can reach";
}