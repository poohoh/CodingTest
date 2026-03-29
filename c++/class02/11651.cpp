#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool cmp(pair<int,int> p1, pair<int,int> p2) {
    if(p1.second == p2.second)
        return p1.first < p2.first;
    return p1.second < p2.second;
}

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int n;
    cin >> n;
    vector<pair<int,int>> v(n);

    for(int i=0; i<n; i++) {
        cin >> v[i].first >> v[i].second;
    }

    sort(v.begin(), v.end(), cmp);

    for(auto& p : v) {
        cout << p.first << " " << p.second << '\n';
    }
}