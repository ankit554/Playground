#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int tb,tr,cr,cb;
  cin>>tb>>tr>>cr>>cb;
  int t_over=tb/6;
  float c_over=cb/6+(cb%6)*0.1;
  cout<<t_over<<endl<<c_over<<endl;
  float rr=cr/c_over;
  cout<<setprecision(1)<<fixed<<rr<<endl;
  float trr=(float)tr/t_over;
  cout<<setprecision(1)<<fixed<<trr<<endl;
  (rr>=trr)?cout<<"Eligible to Win":cout<<"Not Eligible to Win";
  return 0;
}