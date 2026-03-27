#include <iostream>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    string s;
    int idx, mult, res, sum=0;
    
    cin >> s;
    idx = s.find('*');

    for(int i=0; i<13; i++) {
        if(i==idx)
            continue;
        if(i%2==0)
            mult = 1;
        else
            mult = 3;
        sum += (s[i]-'0')*mult;
    }
    
    if(idx%2==0)
        mult = 1;
    else
        mult = 3;
    
    if (sum%10==0)
        res = 0;
    else {
        for(int i=10; i<31; i+=10) {
            if((i-sum%10)%mult == 0) {
                res = (i - sum % 10) / mult;
                break;
            }
        }
    }

    cout << res;
}