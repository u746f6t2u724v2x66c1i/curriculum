class OthelloGame:
    def __init__(self):
        self.board = [[' ' for _ in range(8)] for _ in range(8)]
        self.board[3][3] = 'W'
        self.board[3][4] = 'B'
        self.board[4][3] = 'B'
        self.board[4][4] = 'W'
        self.current_player = 'B'

    def print_board(self):
        for row in self.board:
            print(' | '.join(row))
            print('-' * 31)

    def is_valid_move(self, row, col):
        if self.board[row][col] != ' ':
            return False
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0), (1, 1), (1, -1), (-1, 1), (-1, -1)]
        for dr, dc in directions:
            r, c = row + dr, col + dc
            while 0 <= r < 8 and 0 <= c < 8 and self.board[r][c] != ' ' and self.board[r][c] != self.current_player:
                r, c = r + dr, c + dc
                if 0 <= r < 8 and 0 <= c < 8 and self.board[r][c] == self.current_player:
                    return True
        return False

    def make_move(self, row, col):
        if not self.is_valid_move(row, col):
            return False
        self.board[row][col] = self.current_player
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0), (1, 1), (1, -1), (-1, 1), (-1, -1)]
        for dr, dc in directions:
            r, c = row + dr, col + dc
            while 0 <= r < 8 and 0 <= c < 8 and self.board[r][c] != ' ' and self.board[r][c] != self.current_player:
                r, c = r + dr, c + dc
                if 0 <= r < 8 and 0 <= c < 8 and self.board[r][c] == self.current_player:
                    r, c = row + dr, col + dc
                    while 0 <= r < 8 and 0 <= c < 8 and self.board[r][c] != ' ' and self.board[r][c] != self.current_player:
                        self.board[r][c] = self.current_player
                        r, c = r + dr, c + dc
        self.current_player = 'W' if self.current_player == 'B' else 'B'
        return True
