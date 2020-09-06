#include<iostream>
using namespace std;
int pow(int a,int n)
{
  if(n==1)
    return a;
  else
    return a*pow(a,n-1);
}
int main()
{
  int a,n,ans;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}