#include <stdio.h>

char board[3][3]; 

void drawBoard() {
    int i, j;
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            printf(" %c ", board[i][j]);
            if (j < 2)
                printf("|");
        }
        printf("\n");
        if (i < 2)
            printf("---|---|---\n");
    }
}

char checkWin() {
    int i;
    for (i = 0; i < 3; i++) {
        if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) return board[i][0];
        if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) return board[0][i];
    }
    if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) return board[0][0];
    if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) return board[0][2];
    return ' ';
}

int main() {
    int i, j;
    for (i = 0; i < 3; i++)
        for (j = 0; j < 3; j++)
            board[i][j] = ' ';
    drawBoard();
    while (1) {
        printf("Enter X,Y coordinates for your move: ");
        scanf("%d%*c%d", &i, &j);
        i--; j--;
        if (board[i][j] != ' ') {
            printf("Invalid move, try again.\n");
            continue;
        }
        board[i][j] = 'X';
        drawBoard();
        if (checkWin() == 'X') {
            printf("X wins!\n");
            break;
        }
        printf("Enter X,Y coordinates for your move: ");
        scanf("%d%*c%d", &i, &j);
        i--; j--;
        if (board[i][j] != ' ') {
            printf("Invalid move, try again.\n");
            continue;
        }
        board[i][j] = 'O';
        drawBoard();
        if (checkWin() == 'O') {
            printf("O wins!\n");
            break;
        }
    }
    return 0;
}
