#include <iostream>
using namespace std;

int main() {
    cout << "Enter a number: ";
    int N;
    cin >> N;

    for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N; j++) {
            if (j % N != 0) {
                cout << i * j << " ";
            } else {
                cout << i * j << endl;
            }
        }
    }

    return 0;
}

