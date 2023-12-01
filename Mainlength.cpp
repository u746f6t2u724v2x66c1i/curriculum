#include <iostream>
#include <string>

int main() {
    std::string n;
    std::cin >> n;

    for (int i = 0; i < n.length(); i++) {
        if (i != 0 && i % 3 == 0) {
            std::cout << ",";
        }
        std::cout << n[i];
    }
    
    std::cout << std::endl;

    return 0;
}

