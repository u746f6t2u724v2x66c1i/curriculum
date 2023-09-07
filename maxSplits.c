#include <stdio.h>

/*
 * Complete the 'arraySplitting' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */


// Function to calculate the maximum number of points Nikita can score

int maxSplits(int arr[], int start, int end) {
    if (start == end) {
        return 0;
    }

    int totalSum = 0;
    for (int i = start; i < end; i++) {
        totalSum += arr[i];
    }

    int leftSum = 0;
    int maxScore = 0;

    for (int i = start; i < end - 1; i++) {
        leftSum += arr[i];
        totalSum -= arr[i];

        if (leftSum == totalSum) {
            int leftResult = maxSplits(arr, start, i + 1);
            int rightResult = maxSplits(arr, i + 1, end);
            maxScore = 1 + (leftResult > rightResult ? leftResult : rightResult);
            break;
        }
    }

    return maxScore;
}

int main() {
    int t; // Number of test cases
    scanf("%d", &t);

    while (t--) {
        int n; // Size of the array
        scanf("%d", &n);

        int arr[n];
        for (int i = 0; i < n; i++) {
            scanf("%d", &arr[i]);
        }

        int result = maxSplits(arr, 0, n);
        printf("%d\n", result);
    }

    return 0;
}
