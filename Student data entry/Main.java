#include <iostream>
#include<cstring>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s1;
   cout<<endl<<"Student Details"<<endl;
   cin.get(s1.name, 50);
   cin>>s1.roll;
   cin>>s1.marks;
   cout<<"Name: "<<s1.name<<endl;
   cout<<"Roll: "<<s1.roll<<endl;
  cout<<"Marks: "<<s1.marks;
  return 0;
}