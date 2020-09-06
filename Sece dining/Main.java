#include<iostream>
using namespace std;
int main()
{
  string s;
  cin>>s;
  int n;
  cin>>n;
  if(s=="front"){
    (n==1)? cout<<"Left Handed" : cout<<"Right Handed";
  }
  if(s=="rear"){
    (n!=1)? cout<<"Left Handed" : cout<<"Right Handed";
  }
  
}