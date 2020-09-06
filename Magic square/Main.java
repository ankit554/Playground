#include<iostream>
using namespace std;
int main()
{
 	int n,flag=0,r=0,sum=0;
  	cin>>n;
  	int a[n][n];
  	for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cin>>a[i][j];
          	if(i==j)
          		sum+=a[i][i];
        }
    }
  	for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(i+j==n-1)
          		r=r+a[i][j];
        }
    }
  	if(r==sum)
          	flag=1;
  	if(flag==1)
      	cout<<"Yes";
  	else
      	cout<<"No";
}