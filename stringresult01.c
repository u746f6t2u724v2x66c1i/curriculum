#include <stdio.h>
#include <string.h>

int main() {
    char strings[10][100];  // Array to store 10 strings, assuming each string can have a maximum of 100 characters

    printf("Enter 10 strings:\n");

    // Read 10 input strings
    for (int i = 0; i < 10; i++) {
        scanf("%s", strings[i]);
    }

    // Concatenate the strings with spaces
    char result[1000];  // Assuming the concatenated string won't exceed 1000 characters
    strcpy(result, strings[0]);

    for (int i = 1; i < 10; i++) {
        strcat(result, " ");
        strcat(result, strings[i]);
    }

    // Print the concatenated string
    printf("Concatenated string: %s\n", result);

    return 0;
}

