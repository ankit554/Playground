#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int t=n;
  int sq=n*n,r,count=0,flag=0,sum=0;
  do{
    r=n%10;
    count+=1;
    n=n/10;
  }while(n>0);
  
  int p=1;
  for(int i=1;i<=count;i++)
  	p=p*10;
  
  while(sq>0){
      r=sq%p;
      sum=sum+r;
      sq=sq/p;
  }
  (t==sum) ? cout<<"Kaprekar Number" : cout<<"Not a Kaprekar Number";
}