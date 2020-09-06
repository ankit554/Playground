#include <iostream>
using namespace std;

int findGcd(int a,int b){
    (b==0)? a : findGcd(b,a%b);
}
int main()
{
    int a,b;
    cin>>a>>b;
    int gcd=findGcd(a,b);
    cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd;
    return 0;
}