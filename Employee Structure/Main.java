#include<iostream>
using namespace std;
struct emp
{
  string name;
  int id;
  int age;
  string desig;
  float salary;
};
int main()
{
  emp emp1;
  cout<<"Enter name:"<<endl;
  cin>>emp1.name;
  cout<<"Enter ID:"<<endl;
  cin>>emp1.id;
  cout<<"Enter age:"<<endl;
  cin>>emp1.age;
  cout<<"Enter designation:"<<endl;
  cin>>emp1.desig;
  cout<<"Enter Salary:"<<endl;
  cin>>emp1.salary;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<emp1.name<<endl;
  cout<<"ID of the Employee : "<<emp1.id<<endl;
  cout<<"Age of the Employee : "<<emp1.age<<endl;
  cout<<"Designation of the Employee : "<<emp1.desig<<endl;
  cout<<"Salary of the Employee : "<<emp1.salary<<endl;
}