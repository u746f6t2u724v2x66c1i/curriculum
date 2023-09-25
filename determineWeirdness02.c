#include <stdio.h>
#include <string.h>
#include <stdlib.h>  // Include for atoi

char* ltrim(char *str) {
    while (*str != '\0' && (*str == ' ' || *str == '\t' || *str == '\n' || *str == '\r'))
        str++;
    return str;
}

char* rtrim(char *str) {
    int len = strlen(str);
    while (len > 0 && (str[len - 1] == ' ' || str[len - 1] == '\t' || str[len - 1] == '\n' || str[len - 1] == '\r'))
        len--;
    str[len] = '\0';
    return str;
}

char* determineWeirdness(int N) {
    static char result[20];

    if (N % 2 != 0)
        strcpy(result, "Weird");
    else {
        if (N >= 2 && N <= 5)
            strcpy(result, "Not Weird");
        else if (N >= 6 && N <= 20)
            strcpy(result, "Weird");
        else
            strcpy(result, "Not Weird");
    }

    return result;
}

int main() {
    char N_temp[100];
    int N;

    printf("Enter a number: ");
    fgets(N_temp, sizeof(N_temp), stdin);
    N = atoi(rtrim(ltrim(N_temp)));

    printf("%s\n", determineWeirdness(N));

    return 0;
}

