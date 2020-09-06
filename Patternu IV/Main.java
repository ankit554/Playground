#include <iostream>
using namespace std;
int main() {
    // Type your code here
  	int n,c=1;
  	cin>>n;
  	for(int i=1;i<=n;i++)
    {
     	for(int j=1;j<=n;j++)
        {
          	if(i%2==1)
            {
              	(j==n) ? cout<<++c<<endl : cout<<c;
            }
          	else
            {
              	(j==1) ? cout<<++c : (j==n) ? cout<<c-1<<endl : cout<<c-1;
            }
        }
    }
    return 0;
}