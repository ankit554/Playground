#include <iostream>
using namespace std;
int main()
{
  	int n,c=104,p=121;
  	cin>>n;
  	if(n>0)
      	cout<<p<<" ";
  	for(int i=1;i<n;i++)
    {
     	p=p+c;
      	cout<<p<<" ";
      	c+=32;
    }
}
