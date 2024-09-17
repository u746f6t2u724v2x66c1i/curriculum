#include <stdio.h>
#include <string.h>

void readStrings(char strings[10][100]) {
    printf("Enter 10 strings:\n");

    for (int i = 0; i < 10; i++) {
        scanf("%s", strings[i]);
    }
}

void concatenateStrings(char strings[10][100], char result[1000]) {
    strcpy(result, strings[0]);

    for (int i = 1; i < 10; i++) {
        strcat(result, " ");
        strcat(result, strings[i]);
    }
}

int main() {
    char strings[10][100];
    char result[1000];

    readStrings(strings);
    concatenateStrings(strings, result);

    printf("Concatenated string: %s\n", result);

    return 0;
}
