#include <iostream>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    string s1, s2, s3, res_s;
    string c1="Fizz", c2="Buzz", c3="FizzBuzz";
    int res;

    cin >> s1 >> s2 >> s3;

    if(s1 != c1 && s1 != c2 && s1 != c3)
        res = stoi(s1) + 3;
    else if(s2 != c1 && s2 != c2 && s2 != c3)
        res = stoi(s2) + 2;
    else if(s3 != c1 && s3 != c2 && s3 != c3)
        res = stoi(s3) + 1;
    
    if(res%15==0)
        res_s = "FizzBuzz";
    else if(res%5==0)
        res_s = "Buzz";
    else if (res%3==0)
        res_s = "Fizz";
    else
        res_s = to_string(res);
    
    cout << res_s;
    
}