

#include <iostream>

using namespace std;

int specificNum(int m, int n){
    int count = 0;
    if(m>n){
        return -1;
    }
    
    else{
        
        for(int i =m;i<=n;i++)
            {
                int flag = 1;
                int x = i;
                while(x){
                int z = x % 10;
                x = x / 10;
                if(z == 1 || z == 4 || z == 9){
                    continue;
                }else{
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                count++;
            }
        }    
        return count;
    }
}

int main()
{
    cout<<specificNum(100,200);

    return 0;
}