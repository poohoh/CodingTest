#include <iostream>
#include <vector>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    vector<int> v(10001);
    int n, num;

    cin >> n;

    // for(int i=0; i<10001; i++)
    //     v[i] = 0;

    for(int i=0; i<n; i++) {
        cin >> num;
        v[num]++;
    }
    for(int i=1; i<10001; i++) {
        for(int j=0; j<v[i]; j++)
            cout << i << '\n';
    }
}