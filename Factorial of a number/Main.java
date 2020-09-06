#include<iostream>
using namespace std;
int fact(int x)
{
  if(x==0)
    	return 1;
  else
     	return x*fact(x-1);
}
int main(){
  // Type your code here
  int n;
  cin>>n;
  int res=fact(n);
  cout<<res;
}