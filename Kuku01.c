#include <stdio.h>

int main() {
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
            if (j % 9 != 0) {
                printf("%d ", i * j);
            } else {
                printf("%d\n", i * j);
            }
        }
    }
    return 0;
}

