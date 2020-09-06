#include<iostream>
using namespace std;
int main()
{
 	int n,m;
  	cin>>n>>m;
  	int a[n][m];
  	for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < m; j++){
            cin>>a[i][j];
        }
    }
  	for(int i = 0; i < m; i++)
    {
      	int max=0;
        for(int j = 0; j < n; j++){
            if(a[j][i]>max)
              	max=a[j][i];
        }
      	cout<<max<<endl;
    }
}