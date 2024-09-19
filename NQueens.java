// public class Nqueen {
    
// }
import java.util.*;
public class NQueens {
    private int[] queens; // To store the column position of queens
    private int n; // Number of queens (and size of the board)
    
    public NQueens(int n) {
        this.n = n;
        queens = new int[n];
    }
    
    // Function to check if a queen can be placed in a given row and column
    private boolean isSafe(int row, int col) {
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (queens[i] == col)
                return false;
            
            // Check diagonals: if the difference in the row positions equals the difference in the column positions, then they are in the same diagonal
            if (Math.abs(row - i) == Math.abs(col - queens[i]))
                return false;
        }
        return true;
    }
    
    // Function to solve N-Queens problem using backtracking
    private void solveNQueens(int row) {
        if (row == n) {
            printQueens();
            return;
        }
        
        // Iterate over columns
        for (int col = 0; col < n; col++) {
            // Check if the queen can be placed in this column of the current row
            if (isSafe(row, col)) {
                queens[row] = col; // Place the queen in this column
                
                // Recur for the next row
                solveNQueens(row + 1);
                
                // If placing queen in queens[row] doesn't lead to a solution, backtrack and try next column
                queens[row] = 0;
            }
        }
    }
    
    // Function to print the board configuration
    private void printQueens() {
        System.out.println("Solution:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (queens[i] == j)
                    System.out.print("Q ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Function to solve and print all solutions of N-Queens problem
    public void solveNQueens() {
        solveNQueens(0);
    }
    
    // Main method to test the N-Queens solver
    public static void main(String[] args) {
        int n = 4; // Change this to the desired number of queens (size of the board)
        NQueens solver = new NQueens(n);
        solver.solveNQueens();
    }
}

