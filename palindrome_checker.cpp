#include <iostream>
#include <algorithm>

bool isPalindrome(const std::string& str) {
    std::string reversed = str;
    std::reverse(reversed.begin(), reversed.end());
    return str == reversed;
}

int main() {
    std::string input;
    std::cout << "Enter a word: ";
    std::cin >> input;

    if (isPalindrome(input)) {
        std::cout << "The word, " << input << ", is a palindrome." << std::endl;
    } else {
        std::cout << "The word, " << input << ", is not a palindrome." << std::endl;
    }

    return 0;
}

