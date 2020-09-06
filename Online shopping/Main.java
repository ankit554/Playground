#include<iostream>
using namespace std;
static int a=100000;
int price(int p,int d,int s)
{
  int b= p-p*d/100+s;
  if(b<a){
      a=b;
  }
  
  return b;
}
int main()
{
  int p1,p2,p3,d1,d2,d3,s1,s2,s3;
  cin>>p1>>d1>>s1>>p2>>d2>>s2>>p3>>d3>>s3;
  int flipkart=price(p1,d1,s1);
  cout<<"In Flipkart Rs."<<flipkart<<endl;;
  int snapdeal=price(p2,d2,s2);
  cout<<"In Snapdeal Rs."<<snapdeal<<endl;;
  int amazon=price(p3,d3,s3);
  cout<<"In Amazon Rs."<<amazon<<endl;
  if(a==flipkart)
    cout<<"He will prefer Flipkart";
  else if(a==snapdeal)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
  
  return 0;
}