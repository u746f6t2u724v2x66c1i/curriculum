#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);

    // Create a phone book as an array of structures to store the entries
    struct {
        char name[20];
        char phoneNumber[10];
    } phoneBook[n];

    // Populate the phone book
    for (int i = 0; i < n; i++) {
        scanf("%s %s", phoneBook[i].name, phoneBook[i].phoneNumber);
    }

    char query[20];

    // Process queries and print the results
    while (scanf("%s", query) != EOF) {
        int found = 0;

        for (int i = 0; i < n; i++) {
            if (strcmp(query, phoneBook[i].name) == 0) {
                printf("%s=%s\n", phoneBook[i].name, phoneBook[i].phoneNumber);
                found = 1;
                break;
            }
        }

        if (!found) {
            printf("not found\n");
        }
    }

    return 0;
}

