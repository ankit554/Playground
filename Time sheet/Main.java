#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[7],sum=0,t=0;
  for(int i=0;i<7;i++)
  {
    cin>>a[i];
    sum+=a[i];
    if(a[i]>8)
      	t+=(a[i]-8)*15;
  }
  int sun=0,sat=0,res;
  sun=(a[0]*100);
  sun=sun+(sun*50)/100;
  sat=a[6]*100;
  sat = sat + (sat*25)/100;
  res=(sum-a[0]-a[6])*100;
  cout<<sun+sat+res+t;
}