#include <stdio.h>

int main() {
    // Input n and m
    int n, m;
    printf("Enter n and m separated by a space: ");
    scanf("%d %d", &n, &m);

    // Input n numbers
    int numbers[n];
    printf("Enter n numbers separated by spaces: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &numbers[i]);
    }

    // Output the mth numerical value
    if (m >= 1 && m <= n) {
        printf("The %dth numerical value is: %d\n", m, numbers[m - 1]);
    } else {
        printf("Invalid input for m.\n");
    }

    return 0;
}

