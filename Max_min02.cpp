#include <iostream>
using namespace std;
int main() {
    int A, B, C;
    cin >> A >> B >> C;

    cout << max(A, max(B, C)) - min(A, min(B, C)) << endl;
}
