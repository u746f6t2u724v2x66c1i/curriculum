#include <iostream>

class AdvancedArithmetic {
public:
    virtual int divisorSum(int n) = 0;
};

class Calculator : public AdvancedArithmetic {
public:
    int divisorSum(int n) override {
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
};

int main() {
    int n;
    std::cin >> n;

    Calculator myCalculator;
    int sum = myCalculator.divisorSum(n);

    std::cout << "I implemented: AdvancedArithmetic" << std::endl;
    std::cout << sum << std::endl;

    return 0;
}

