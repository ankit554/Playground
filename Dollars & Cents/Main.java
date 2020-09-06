#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int d,c,dd,cc;
  cin>>d>>c>>dd>>cc;
  int t=c+cc,nc,nd;
  if(t>100){
    	int res=t/100;
    	nc=t-res*100;
    	nd=d+dd+res;
  }
  else{
    nc=t;
    nd=d+dd;
  }
  cout<<nd<<endl<<nc;
}