#include <iostream>
#include <string>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int n, res = 1, count=0;
    cin >> n;

    while(n >= 5) {
        count += n/5;
        n /= 5;
    }

    cout << count;
}