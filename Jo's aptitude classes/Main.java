#include <iostream>
using namespace std;

int gcd(int a,int b){
    (b==0)? a : gcd(b,a%b);
}

int main()
{
    int a,b,c,d;
    cin>>a>>b>>c>>d;
    int g=gcd(a,gcd(b,gcd(c,d)));
    (g==d) ? cout<<"Answer is correct." : cout<<"Answer is wrong.";
    return 0;
}