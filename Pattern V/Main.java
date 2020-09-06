#include <iostream>
using namespace std;
int main()
{
  	int n,c=0,ptr=1;
  	cin>>n;
  	int qtr=(n*n)+1;
  	for(int i=1;i<=n;i++)
    {
        if(i!=1)
        {
         	for(int p=1;p<=i+c;p++)
         	{
         	    cout<<"-";
         	}
         	c++;
        }
        for(int j=n;j>=i;j--)
        {
            cout<<ptr<<"*";
            ptr++;
        }
        for(int t=n;t>=i;t--)
        {
            cout<<qtr;
            if(t!=i)
                cout<<"*";
            qtr++;
        }
        qtr=qtr-((2*n)-(2*i))-1;
     	cout<<endl;
    }
}