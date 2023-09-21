#include <iostream>
using namespace std;
int main() {
    string s;
    cin >> s;
    int remainder = s.size() % 3;
    for (int i = 0; i < s.size(); i++) {
        if (i % 3 == remainder && i != 0) {
            cout << ',';
        }
        cout << s[i];
    }
    cout << endl;
}
