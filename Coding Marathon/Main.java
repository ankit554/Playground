#include <bits/stdc++.h>
using namespace std;
int find(int m,int n,int *a)
{
    int t=m-1,sum=0;
    for(int i=1;i<=n;i++)
    {
        sum+=a[t];
        t--;
    }
    return sum;
}
int main() 
{
   	int m,n;
   	cin>>m>>n;
   	int a[m];
   	for(int i=0;i<m;i++)
   	{
   	    cin>>a[i];
   	}
   	sort(a,a+m);
   	cout<<find(m,n,a);
    return 0;
}