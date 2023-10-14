#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::vector<int> a(6);

    std::cout << "Enter three natural numbers (A B C D E F): ";
    for (int i = 0; i < 6; i++) {
        std::cin >> a[i];
    }

    // Sort the vector
    std::sort(a.begin(), a.end());

    int max = a[5];  // Maximum value
    int min = a[0];  // Minimum value

    // Calculate and print the difference
    std::cout << "Maximum value: " << max << "\n";
    std::cout << "Minimum value: " << min << "\n";
    std::cout << "Difference: " << max - min << "\n";

    return 0;
}

