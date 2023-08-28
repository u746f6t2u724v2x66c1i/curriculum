#include <stdio.h>

void miniMaxSum(int arr[], int size) {
    long long total_sum = 0;
    int max_value = arr[0];
    int min_value = arr[0];

    for (int i = 0; i < size; i++) {
        total_sum += arr[i];
        if (arr[i] > max_value) {
            max_value = arr[i];
        }
        if (arr[i] < min_value) {
            min_value = arr[i];
        }
    }

    long long max_sum = total_sum - min_value;
    long long min_sum = total_sum - max_value;

    printf("%lld %lld\n", min_sum, max_sum);
}

int main() {
    int arr[5];
    for (int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }

    miniMaxSum(arr, 5);

    return 0;
}
