#include <iostream>
using namespace std;
int main()
{
  	int x,y;
  	cin>>x>>y;
 	int res=0;
  	for(int i=x;i<y;i++)
    {
      	for(int j=1;j<i;j++)
        {
            if(i%j==0){
              	res+=j;
            }
        }
      	if(res==i){
          	cout<<i<<" ";
        }
      
      	res=0;
    }
}