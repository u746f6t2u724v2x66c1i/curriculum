#include <stdio.h>

int main() {
    int a[6];
    
    printf("Enter three natural numbers (A B C D E F): ");
    for (int i = 0; i < 6; i++) {
        scanf("%d", &a[i]);
    }

    // Find the maximum and minimum
    int max = a[0], min = a[0];
    for (int i = 1; i < 6; i++) {
        if (a[i] > max) {
            max = a[i];
        }
        if (a[i] < min) {
            min = a[i];
        }
    }

    // Calculate and print the difference
    printf("Maximum value: %d\n", max);
    printf("Minimum value: %d\n", min);
    printf("Difference: %d\n", max - min);

    return 0;
}

