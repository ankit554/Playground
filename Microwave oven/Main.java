#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int n1;
  float n2;
  cin>>n1>>n2;
  float f=n2/2;
  float f2=(n2/2)*(n1);
  if(n1>3){
    cout<<"Number of items is more";
  }
  else{
  	cout<<setprecision(2)<<fixed<<f2+f;
  }
}