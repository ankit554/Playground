#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  	int n,rev=0,dig;
  	cin>>n;
  while(n>0){
  	dig=n%10;
  	rev=(rev*10)+dig;
  	n=n/10;
  }
    cout<<rev;
	return 0;
}