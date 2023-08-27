#include <stdio.h>
#include <stdlib.h>

int diagonalDifference(int arr[][100], int n) {
    int sum1 = 0; // sum of the main diagonal
    int sum2 = 0; // sum of the secondary diagonal

    for (int i = 0; i < n; i++) {
        sum1 += arr[i][i];
        sum2 += arr[i][n - i - 1];
    }

    return abs(sum1 - sum2);
}

int main() {
    int n;
    scanf("%d", &n);

    int arr[100][100];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &arr[i][j]);
        }
    }

    int diagonalDifferenceResult = diagonalDifference(arr, n);
    printf("%d\n", diagonalDifferenceResult);

    return 0;
}
