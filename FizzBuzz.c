#include <stdio.h>

int main() {
    int N;
    printf("Enter a number: ");
    scanf("%d", &N);

    for (int n = 1; n <= N; n++) {
        if (n % 3 == 0 && n % 5 == 0) {
            printf("FizzBuzz\n");
        } else if (n % 3 == 0) {
            printf("Fizz\n");
        } else if (n % 5 == 0) {
            printf("Buzz\n");
        } else {
            printf("%d\n", n);
        }
    }

    return 0;
}
