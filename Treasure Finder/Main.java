#include<iostream>
using namespace std;
int hcf(int a, int b)
{
    while (a != b)
    {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }
    return a;
}
int main()
{
  //Type your code here.
  int x,l1=0,l2=0,l3=0;
  for(int i=0;i<3;i++)
  {
    cin>>x;
    if(x>l1){
      l3=l2;
      l2=l1;
      l1=x;
    }else if(x<l1 && x>l2){
      l3=l2;
      l2=x;
    }else if(x<l2 && x>l3){
      l3=x;
    }
  }
  int ans2;
  ans2=hcf(l1,hcf(l2,l3));
  cout<<"The treasure is in box which has number "<<l2<<endl;
  cout<<"The code to open the box is "<<ans2;
}