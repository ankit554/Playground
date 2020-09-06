#include<iostream>
using namespace std;
int main()
{
  int mw,w;
  cin>>mw>>w;
  if(w<mw){
    cout<<"Yes, you can enter.";
  }
  else if(w==mw){
    cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else{
    cout<<"Sorry, you can't enter";
  }
}