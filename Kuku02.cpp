#include <iostream>

int main() {
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
            if (j % 9 != 0) {
                std::cout << i * j << " ";
            } else {
                std::cout << i * j << std::endl;
            }
        }
    }
    return 0;
}

