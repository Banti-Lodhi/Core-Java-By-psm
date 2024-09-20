import java.util.ArrayList;
import java.util.List;

public class backtrack {

  // Method to check if it's safe to place a queen at board[row][col]
  public boolean isSafe(int row, int col, char[][] board) {
    int n = board.length;

    // Horizontally
    for (int j = 0; j < n; j++) {
      if (board[row][j] == 'Q') {
        return false;
      }
    }

    // Vertically
    for (int i = 0; i < n; i++) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }

    // Upper left diagonal
    for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
      if (board[r][c] == 'Q') {
        return false;
      }
    }

    // Upper right diagonal
    for (int r = row, c = col; r >= 0 && c < n; r--, c++) {
      if (board[r][c] == 'Q') {
        return false;
      }
    }

    // Lower left diagonal
    for (int r = row, c = col; r < n && c >= 0; r++, c--) {
      if (board[r][c] == 'Q') {
        return false;
      }
    }

    // Lower right diagonal
    for (int r = row, c = col; r < n && c < n; r++, c++) {
      if (board[r][c] == 'Q') {
        return false;
      }
    }

    return true;
  }

  // Method to convert the board to a list of strings and add it to allBoards
  public void saveBoard(char[][] board, List<List<String>> allBoards) {
    List<String> newBoard = new ArrayList<>();
    for (int i = 0; i < board.length; i++) {
      StringBuilder row = new StringBuilder();
      for (int j = 0; j < board[i].length; j++) {
        row.append(board[i][j] == 'Q' ? 'Q' : '.');
      }
      newBoard.add(row.toString());
    }
    allBoards.add(newBoard);
  }

  // Recursive method to place queens
  public void helper(char[][] board, List<List<String>> allBoards, int col) {
    if (col == board.length) {
      saveBoard(board, allBoards);
      return;
    }
    for (int row = 0; row < board.length; row++) {
      if (isSafe(row, col, board)) {
        board[row][col] = 'Q';
        helper(board, allBoards, col + 1);
        board[row][col] = '.';
      }
    }
  }

  // Main method to solve the N-Queens problem
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> allBoards = new ArrayList<>();
    char[][] board = new char[n][n];
    // Initialize board with '.' characters
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = '.';
      }
    }
    helper(board, allBoards, 0);
    return allBoards;
  }

  public static void main(String[] args) {
    backtrack solver = new backtrack();
    int n = 4; // Example: solve for 4-Queens
    List<List<String>> solutions = solver.solveNQueens(n);
    for (List<String> solution : solutions) {
      for (String row : solution) {
        System.out.println(row);
      }
      System.out.println();
    }
  }
}