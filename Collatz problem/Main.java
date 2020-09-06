#include<iostream>
using namespace std;
int main()
{
  int n,flag=0;
  cin>>n;
  cout<<n<<endl;
  while(n!=1)
  {
    if(n%2==0){
      n=n/2;
      flag++;
      cout<<n<<endl;
    }
    else{
      n=3*n+1;
      flag++;
      cout<<n<<endl;
    }
  }
  cout<<flag;
}