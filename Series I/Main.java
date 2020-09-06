#include<iostream>
using namespace std;
int main()
{
  	int n;
  	float f=0.5;
  	cin>>n;
  	if(n>0)
      	cout<<f<<" ";
  	for(int i=1;i<n;i++)
    {
      	f=f*3;
      	cout<<f<<" ";
    }
}