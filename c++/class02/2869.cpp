#include <iostream>

using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int a, b, v, add;
    cin >> a >> b >> v;

    // if((v - a) % (a - b)==0)
    //     add = 0;
    // else
    //     add = 1;
    // cout << 1 + (v - a) / (a - b) + add;
    cout << 1 + (v - b - 1) / (a - b);
}