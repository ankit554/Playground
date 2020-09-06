#include<iostream>
using namespace std;
int main()
{
  	int n,x,p;
  	cout<<"Enter the number of elements in the array"<<endl;
  	cin>>n;
  	int a[n];
  	cout<<"Enter the elements in the array"<<endl;
  	for(int i=0;i<n;i++)
  	{
      	cin>>a[i];
    }
  	cout<<"Enter the location where you wish to insert an element"<<endl;
  	cin>>p;
  	if(p>n)
      	cout<<"Invalid Input"<<endl;
  	else
    {
  		cout<<"Enter the value to insert"<<endl;
		cin>>x;
      	int b[n+1];
      	for(int i=0;i<n+1;i++)
        {
          	if(p-1==i)
              	b[i]=x;
            if(p-1>i)
              	b[i]=a[i];
          	if(p-1<i)
              	b[i]=a[i-1];
        }
      	cout<<"Array after insertion is"<<endl;
      	for(int i=0;i<=n;i++)
        {
            cout<<b[i]<<endl;
        }
    }
}