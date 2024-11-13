import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get a positive integer input for the matrix size
    System.out.print("Please enter the size of your matrix: ");
    int size = scanner.nextInt();
    scanner.close(); // Closes the scanner

    if (size <= 0) {
      System.out.println("Please make sure you are entering a positive integer!");
      return;
    }

    // Create and fill in the matrix
    Matrix matrix = new Matrix(size);
    matrix.populateMatrix();

    // Display the matrix with the initial values
    System.out.println("\nPopulating matrix...matrix populated");
    System.out.println("\nPrinting matrix:");
    matrix.printMatrix();

    // Flip the matrix on the diagonal line and print
    matrix.flipMatrix();
    System.out.println("\nFlipping matrix...matrix flipped");
    System.out.println("\nPrinting flipped matrix:");
    matrix.printMatrix();
  }
}
