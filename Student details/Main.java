#include<iostream>
#include<cstring>
#include<iomanip>
using namespace std;
struct student
{
  char name[30];
  char department[20];
  int yearOfStudy;
  float cgpa;
};
int main()
{
  int n;
  cout<<"Enter the number of students"<<endl;
  (cin>>n).get();
  student s[n];
  char x[n][30],t[30];
  for(int i=0; i<n; i++)
  {
    cout<<"Enter the details of student "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin.getline(s[i].name,30);
    strcpy(x[i], s[i].name);
    cout<<"Enter department"<<endl;
    (cin>>s[i].department).get();
    cout<<"Enter year of study"<<endl;
    (cin>>s[i].yearOfStudy).get();
    cout<<"Enter cgpa"<<endl;
    (cin>>s[i].cgpa).get();
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n-i-1;j++)
    {
      if(strcmp(x[j],x[j+1])>0)
      {
        strcpy(t, x[j]);
        strcpy(x[j], x[j+1]);
        strcpy(x[j+1], t);
      }
    }
  }
  cout<<"Details of students"<<endl;
  for(int i=0;i<n;i++)
    {
      for(int j=0; j<n; j++)
      {
        if(strcmp(x[i],s[j].name)==0)
        {
          cout<<"Student "<<i+1<<endl;
          cout<<"Name:"<<s[j].name<<endl;
          cout<<"Department:"<<s[j].department<<endl;
          cout<<"Year of study:"<<s[j].yearOfStudy<<endl;
          cout<<"CGPA:"<<setprecision(2)<<s[j].cgpa<<endl;
          break;
        }    
      }
    }
  return 0;
}