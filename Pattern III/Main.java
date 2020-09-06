#include<iostream>
using namespace std;
int main()
{
 	int n;
  	cin>>n;
  	for(int i=1;i<=n;i++)
    {
      	for(int j=1;j<=i;j++)
        {
          	cout<<i;
          	(i==j) ? cout<<endl : cout<<"*";
        }
    }
  	for(int p=n;p>=1;p--)
    {
      	for(int t=1;t<=p;t++)
        {
          	cout<<p;
          	(p==t) ? cout<<endl : cout<<"*";
        }
    }
}