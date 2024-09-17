#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    // Seed the random number generator
    srand(time(NULL));

    // Generate a random number between 1 and 9
    int extractedNumber = rand() % 9 + 1;

    // Check if the extracted number is 7 (considered good luck)
    int isDaikichi = (extractedNumber == 7);

    // Output the result
    printf("The extracted number is: %d\n", extractedNumber);
    printf("Is it Daikichi? %s\n", isDaikichi ? "Yes" : "No");

    return 0;
}







