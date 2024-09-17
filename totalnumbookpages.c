#include <stdio.h>
#include <stdlib.h>

/*
 * This stores the total number of books in each shelf.
 */
int* total_number_of_books;

/*
 * This stores the total number of pages in each book of each shelf.
 * The rows represent the shelves and the columns represent the books.
 */
int** total_number_of_pages;

int main() {
    int total_number_of_shelves;
    
    // Read the initial number of shelves
    scanf("%d", &total_number_of_shelves);
    
    // Initialize arrays to store the number of books and pages on each shelf
    total_number_of_books = (int*)calloc(total_number_of_shelves, sizeof(int));
    total_number_of_pages = (int**)calloc(total_number_of_shelves, sizeof(int*));

    for (int i = 0; i < total_number_of_shelves; i++) {
        total_number_of_pages[i] = NULL;  // Initialize to NULL
    }

    int total_number_of_queries;
    scanf("%d", &total_number_of_queries);

    for (int q = 0; q < total_number_of_queries; q++) {
        int type_of_query;
        scanf("%d", &type_of_query);

        if (type_of_query == 1) {
            int x, y;
            scanf("%d %d", &x, &y);

            // Ensure the shelf is initialized
            if (total_number_of_pages[x] == NULL) {
                total_number_of_pages[x] = (int*)calloc(1100, sizeof(int));
            }

            // Insert y pages of a book at the end of the xth shelf
            total_number_of_pages[x][total_number_of_books[x]] = y;
            total_number_of_books[x]++;
        } else if (type_of_query == 2) {
            int x, y;
            scanf("%d %d", &x, &y);
            printf("%d\n", *(*(total_number_of_pages + x) + y));
        } else {
            int x;
            scanf("%d", &x);
            printf("%d\n", *(total_number_of_books + x));
        }
    }

    // Free allocated memory
    free(total_number_of_books);
    for (int i = 0; i < total_number_of_shelves; i++) {
        if (total_number_of_pages[i]) {
            free(total_number_of_pages[i]);
        }
    }
    free(total_number_of_pages);

    return 0;
}

