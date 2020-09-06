#include<iostream>
using namespace std;
int check(int a, int b, int c){
  for(int i=1;2*i<a*b;i++)
  {
   
    if(c<b){
      return 1;
    }
   	if(c==(i*b)+1 || c==(i*b)){
      return 1;
    }
    else if(c==(i+1)*b)
    {
      return 1;
    }
    if(2*i==a*b){
      return 0;
    }
    
  }
}
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  int res=check(a,b,c);
  (res==1)?cout<<"Yes" :cout<<"No";
}