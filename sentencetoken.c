#include <stdio.h>
#include <string.h>

int main() {
    char sentence[1000];
    fgets(sentence, sizeof(sentence), stdin);  // Read the input sentence

    char *token = strtok(sentence, " ");  // Tokenize the sentence using space as a delimiter

    while (token != NULL) {
        printf("%s\n", token);  // Print each word on a new line
        token = strtok(NULL, " ");  // Get the next token
    }

    return 0;
}


