#include <iostream>
#include <vector>

int main() {
    int n, m;
    std::cin >> n >> m;

    std::vector<int> a(n);
    for (int i = 0; i < n; ++i) {
        std::cin >> a[i];
    }

    std::vector<int> b(m);
    for (int i = 0; i < m; ++i) {
        std::cin >> b[i];
    }

    int nextIndex = 0;
    for (int x : b) {
        for (int i = 0; i < x; ++i) {
            std::cout << a[nextIndex];
            if (i < x - 1) {
                std::cout << " ";
            } else {
                std::cout << std::endl;
            }

            nextIndex += 1;
        }
    }

    return 0;
}

