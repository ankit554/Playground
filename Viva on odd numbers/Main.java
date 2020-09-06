#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,flag=0;
  float sc=0;
  while(flag!=3)
  {
    cin>>x;
    if(x>0){
      if(x%2==1)
      {
        flag++;
        sc+=1;
      }
      else
        sc-=0.5;
    }
    else{
      sc-=1;
      break;
    }
  }
  cout<<sc;
}