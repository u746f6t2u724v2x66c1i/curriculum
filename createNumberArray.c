#include <stdio.h>
#include <stdlib.h>

// Function to create and return an array of numbers based on user input
int *createNumberArray(int size) {
    int *arr = (int *)malloc(size * sizeof(int));
    
    printf("Enter %d numbers:\n", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }
    
    return arr;
}

// Function to manipulate numbers in the array
void manipulateNumbers(int *arr, int size) {
    // Square each element in the array
    for (int i = 0; i < size; i++) {
        arr[i] *= arr[i];
    }
}

// Function to print the elements of the array
void printArray(int *arr, int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Function to free the allocated memory
void freeMemory(int *arr) {
    free(arr);
    arr = NULL; // Set to NULL after freeing to avoid dangling pointers
}

int main() {
    int arraySize;

    // Get the size of the array from the user
    printf("Enter the size of the array: ");
    scanf("%d", &arraySize);

    // Check for a valid array size
    if (arraySize <= 0) {
        printf("Invalid array size. Exiting program.\n");
        return 1;
    }

    // Create and initialize the array based on user input
    int *numbers = createNumberArray(arraySize);

    // Manipulate the numbers in the array
    manipulateNumbers(numbers, arraySize);

    // Display the manipulated array
    printf("Manipulated Numbers: ");
    printArray(numbers, arraySize);

    // Free the allocated memory
    freeMemory(numbers);

    return 0;
}

