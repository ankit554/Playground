#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  	int r,sum=0,t=n;
  if(n<=999)
  {
      while(n>0)
      {
          r=n%10;
          sum=sum+power(r,3);
          n/=10;
      }
  }
  else
  {
      while(n>0)
      {
          r=n%10;
          sum=sum+power(r,4);
          n/=10;
      }
  }
  	if(sum==t)
      	return 1;
  	else
      	return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}