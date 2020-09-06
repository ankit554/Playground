#include <iostream>
#include <string>
using namespace std;
int countp(string s)
{
    int l=s.length(),c=0,a[l],flag=1,count=0;
    for(int i=0;i<l;i++)
    {
        if(s[i]==' ')
        {
            a[c++]=i;
        }
    }
    for(int i=0;i<=c-1;i++)
    {
        if(i==0)
        {
            for(int t=0;t<a[i];t++)
            {
                if(s[t]!=s[a[i]-1-t])
                    flag=0;
            }
            if(flag==1)
                count++;
            flag=1;
        }
        else
        {
            int x=0;
            for(int t=(a[i-1])+1;t<a[i];t++)
            {
                if(s[t]!=s[a[i]-1-x])
                    flag=0;
                x++;
            }
            if(flag==1)
                count++;
            flag=1;
        }
        
    }
    // int y=0;
    // for(int p=a[c-1]+1;p<l;p++)
    // {
    //     if(s[p]!=s[l-1-y])
    //         flag=0;
    //     y++;
    // }
    // if(flag==1)
    //     count++;
    return count;
}
int main() 
{
   	string s;
   	getline(cin,s);
   	s=s+' ';
   	cout<<countp(s);
    return 0;
}