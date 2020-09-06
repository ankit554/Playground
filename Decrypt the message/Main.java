#include <iostream>
using namespace std;
int main()
{
  	int x,y;
  	cin>>x>>y;
  	int sum=x+y;
 	int res=0;
  	for(int i=1;i<sum;i++)
    {
      	if(sum%i==0){
          	res+=i;
        }
    }
  	(res==sum) ? cout<<"They can read the message" : cout<<"They can't read the message";
}