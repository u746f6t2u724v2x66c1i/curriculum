#include <stdio.h>
#include <string.h>

int main() {
    char num[1000]; // Declare a character array to store the input string
    int count[10] = {0}; // Initialize an array to store the frequency of each digit from 0 to 9

    // Read the input string
    scanf("%s", num);

    // Calculate the length of the input string
    int len = strlen(num);

    // Iterate through each character in the input string
    for (int i = 0; i < len; i++) {
        // Check if the current character is a digit
        if (num[i] >= '0' && num[i] <= '9') {
            // If it's a digit, convert it to an integer and update the count array
            int digit = num[i] - '0';
            count[digit]++;
        }
    }

    // Print the frequency of each digit from 0 to 9
    for (int i = 0; i < 10; i++) {
        printf("%d ", count[i]);
    }
    printf("\n");
    return 0;
}

