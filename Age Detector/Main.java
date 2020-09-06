#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n1,n2;
  cin>>n1>>n2;
  if(n2>n1){
    cout<<n2-n1;
  }
  else{
    n2=n2+100;
    cout<<n2-n1;
  }
}