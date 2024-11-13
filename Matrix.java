public class Matrix {
  private int[][] matrix;

  // Makes a matrix of the given sides and prints the dimensions
  public Matrix(int size) {
    this.matrix = new int[size][size];
    System.out.println("\nYour matrix is " + size + " x " + size);
    System.out.println("\nPrinting matrix with default values\n");
    printMatrix();
  }

  // Fills in the matrix with values from 1 till the length
  public void populateMatrix() {
    int value = 1;
    for (int[] row : matrix) {
        for (int j = 0; j < row.length; j++) {
            row[j] = value++;
        }
    }
  }

  // Swaps the points at (x1, y1) and at (x2, y2)
  private void swap(int x1, int y1, int x2, int y2) {
    int placeHolder = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = placeHolder;
  }

  // Prints the matrix
  public void printMatrix() {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            // Checks if the value is along the diagonal line that goes from the top-right corner to the bottom-left
            if (i + j == matrix.length - 1) {
                System.out.print("\033[43m" + matrix[i][j] + "\033[0m" + "\t");  // Highlights along the diagonal
            } else {
                System.out.print(matrix[i][j] + "\t");  // Does not highlight for values not along the diagonal
            }
        }
        System.out.println();
    }
  }

  // Flips the matrix
  public void flipMatrix() {
    int size = matrix.length;
    for (int row = 0; row < size; row++) {
      for (int column = 0; column < size - row - 1; column++) {
          swap(row, column, size - column - 1, size - row - 1);
      }
    }
  }
}
