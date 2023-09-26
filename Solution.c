#include <stdio.h>

int main() {
    int N;
    printf("Enter a number: ");
    scanf("%d", &N);

    for (int n = 1; n <= 10; n++) {
        printf("%d x %d = %d\n", N, n, N * n);
    }

    return 0;
}

