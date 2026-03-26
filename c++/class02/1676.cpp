#include <iostream>
#include <string>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int n, res = 1, count2=0, count5=0;
    cin >> n;

    for(int i=1; i<=n; i++) {
        int j=i;
        while(j%2==0) {
            count2++;
            j /= 2;
        }
        j = i;
        while(j%5==0) {
            count5++;
            j /= 5;
        }
    }
    cout << min(count2, count5);
}