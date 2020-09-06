#include<iostream>
#include<cstring>
using namespace std;
struct College 
{ 
  char name[100]; 
  char city[100]; 
  int establishmentYear; 
  float passPercentage; 
};
int main()
{
  int n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  College c[n];
  char x[n][100],t[100];
  int i,j;
  for(i=0; i<n; i++)
  {
    cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>c[i].name;
    strcpy(x[i],c[i].name);
    cout<<"Enter city"<<endl;
    cin>>c[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>c[i].establishmentYear;
    cout<<"Enter pass percentage"<<endl;
    cin>>c[i].passPercentage;
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n-i-1;j++)
    {
      if(strcmp(x[j],x[j+1])>0)
      {
        strcpy(t, x[j]);
        strcpy(x[j], x[j+1]);
        strcpy(x[j+1], t);
      }
    }
  }
  cout<<"Details of colleges"<<endl;
  for(int i=0;i<n;i++)
  {
    for(int j=0; j<n; j++)
    {
      if(strcmp(x[i],c[j].name)==0)
      {
        cout<<"College:"<<i+1<<endl;
        cout<<"Name:"<<c[j].name<<endl;
        cout<<"City:"<<c[j].city<<endl;
        cout<<"Year of establishment:"<<c[j].establishmentYear<<endl;
        cout<<"Pass percentage:"<<c[j].passPercentage<<endl;
        break;
      }
    }
  }
  return 0;
}