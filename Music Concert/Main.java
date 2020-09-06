#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,f=0,m=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    (a[i]%2==0) ? f++ : m++ ;
  }
  cout<<m<<endl<<f;
  return 0;
}