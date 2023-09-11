#include <stdio.h>
#include <stdlib.h> // Include the stdlib.h header for the abs() function

void update(int *a, int *b) {
    // Complete this function
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d\n", a + b, abs(a - b)); // Use abs(a - b) to calculate the absolute difference

    return 0;
}

