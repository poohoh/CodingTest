#include <iostream>
#include <string>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int n;
    cin >> n;

    int num = 665, count = 0;
    while(count<n) {
        num++;
        string s = to_string(num);
        if(s.find("666") != string::npos)
            count++;
    }
    cout << num;
}