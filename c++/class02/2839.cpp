#include <iostream>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int n, count3=0;
    cin >> n;

    while( (n-3*count3) >= 0 && (n - 3*count3) % 5 != 0) {
        count3++;
    }
    
    if(n-3*count3 < 0) cout << -1;
    else cout << (n-3*count3) / 5 + count3;
}