#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,tree;
  cin>>r>>c>>tree;
  if(tree>c && tree<=(2*c)){
    cout<<"It is a mango tree";
  }else if(tree>(r*c)-(2*c) && tree<=(r*c)-c){
    cout<<"It is a mango tree";
  }else{
    cout<<"It is not a mango tree";
  }
}