#include <iostream>
#include <vector>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int n, w, h;

    cin >> n;
    vector<vector<int>> body(n, vector<int>(2));
    vector<int> rank(n,1);

    for(int i=0; i<n; i++) {
        cin >> w >> h;
        body[i][0] = w;
        body[i][1] = h;
    }

    for(int i=0; i<n; i++) {
        for(int j=i+1; j<n; j++) {
            if(body[i][0] > body[j][0] && body[i][1] > body[j][1])
                rank[j]++;
            else if(body[i][0] < body[j][0] && body[i][1] < body[j][1])
                rank[i]++;
        }
    }

    for(int i=0; i<n; i++)
        cout << rank[i] << '\n';
}