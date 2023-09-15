#include <stdio.h>
#include <string.h>

int main() {
    char tokenA[100];
    printf("Enter a string: ");
    scanf("%s", tokenA);

    if (strcmp(tokenA, "paiza") == 0) {
        printf("YES\n");
    } else {
        printf("NO\n");
    }

    return 0;
}
