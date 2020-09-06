#include <iostream>
#include <cmath>
using namespace std;
int main()
{
	int n,flag=1;
  	cin>>n;
  	if(n==2)
      	cout<<"Eligible";
  	if(n==1)
      	cout<<"Not eligible";
  	else if(n%2==1)
    {
      	for(int i=2;i<sqrt(n);i++)
        {
         	if(n%i==0)
            {
              	flag=0;
          		break;
            }
        }
      	(flag==1) ? cout<<"Eligible" : cout<<"Not eligible";
    }
  	else
    {
      cout<<"Not eligible";
    }
  	
}