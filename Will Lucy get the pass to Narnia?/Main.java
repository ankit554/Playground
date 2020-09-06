#include <iostream>
using namespace std;
int main()
{
  int fn,sn,op;
  cout<<"Enter first number : ";
  cin>>fn;
  cout<<"Enter second number : ";
  cin>>sn;
  cout<<"Menu"<<"\n"<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n";
  cout<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n5.Remainder\n";
  cin>>op;
  switch(op){
      case 1 : cout<<fn+sn;
      break;
      case 2 : cout<<fn-sn;
      break;
      case 3 : cout<<fn*sn;
      break;
      case 4 : cout<<fn/sn;
      break;
      case 5 : cout<<fn%sn;
      break;
      default : cout<<"Invalid operation";
      break;
   }
}