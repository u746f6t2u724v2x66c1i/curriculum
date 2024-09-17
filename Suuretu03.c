#include <stdio.h>

int main() {
    // Input n
    int n;
    scanf("%d", &n);

    // Input n numbers01
    int numbers01[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &numbers01[i]);
    }

    // Input m
    int m;
    scanf("%d", &m);

    // Input n numbers02
    int numbers02[m];
    for (int i = 0; i < m; i++) {
        scanf("%d", &numbers02[i]);
    }

    for (int i = 0; i < m; i++) {
        int index = numbers02[i] - 1;
        if (index < n) {
            printf("%d\n", numbers01[index]);
        } else {
            printf("Ten\n");
        }
    }

    return 0;
}

