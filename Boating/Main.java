#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int maxw,ad,chi;
  cin>>maxw>>ad>>chi;
  if((75*ad)+(chi*30)<=maxw){
    cout<<"Boat is stable";
  }else{
    cout<<"Boat will drow";
  }
}