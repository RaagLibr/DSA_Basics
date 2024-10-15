package ArrayDSA;

/*
 * Define the boundaries of the matrix with variables top, bottom, left, and right.
Print the top row from left to right and increment top.
Print the right column from top to bottom and decrement right.
Check if boundaries have crossed; if not, print the bottom row from right to left and decrement bottom.
Print the left column from bottom to top and increment left.
Repeat until all boundaries are crossed.
 * 
 */



public class SpiralMatrix {

    public static void spiralMatrix(int matrix[][]) {
        if (matrix.length == 0) return; // Handle empty matrix

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top boundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++; // Move the top boundary down

            // Right boundary
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--; // Move the right boundary left

            // Bottom boundary (only if there's still a row to process)
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--; // Move the bottom boundary up
            }

            // Left boundary (only if there's still a column to process)
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++; // Move the left boundary right
            }
        }

        System.out.println(); // For a new line after printing the matrix
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        spiralMatrix(matrix);
    }
}
