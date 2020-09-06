#include <iostream>
using namespace std;
int find(int m,int n,int *a)
{
    int p[m],flag=0,count=0,sum=0;
    for(int j=1;j<=m;j++)
    {
        for(int t=0;t<n;t++)
        {
            if(a[t]==j)
            {
                flag=1;
                break;
            }
        }
        if(flag!=1)
        {
            sum=sum+j;
            if(sum<=m)
                count+=1;
        }
        flag=0;
    }
    return count;
}
int main() 
{
   	int m,n;
   	cin>>m>>n;
   	int a[n];
   	for(int i=0;i<n;i++)
   	{
   	    cin>>a[i];
   	}
   	cout<<find(m,n,a);
    return 0;
}