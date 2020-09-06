#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int y;
  cin>>y;
  if(y%4==0){
    if(y%100==0){
      if(y%400==0){
        cout<<"Vicky can celebrate his birthday.";
      }
      else{
        cout<<"Vicky can't celebrate.";
      }
    }
    else{
      cout<<"Vicky can celebrate his birthday.";
    }
  }
  else{
      cout<<"Vicky can't celebrate.";
   }
}