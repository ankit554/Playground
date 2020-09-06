#include <iostream>
using namespace std;
int check(int a,int b)
{
  	int t=a;
  	for(int i=1;i<b;i++)
      	t=t*a;
  	return t;
}
int main()
{
  	int m,n,req;
  	cin>>m>>n>>req;
  	if(check(m,n)>=req)
      	cout<<"Doctor, you can proceed with your experiment.";
  	if(check(m,n)<req)
      	cout<<"Sorry Doctor! You need more bacteria.";
  	return 0;
}
  	