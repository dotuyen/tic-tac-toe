import java.util.*;

public class Main {
   public static void main(String[] args) {
      // write your code here
      Scanner scanner = new Scanner(System.in);
      char[][] matrix = new char[4][4];
      for (int i = 0; i < 4; i++) {
         matrix[i] = scanner.nextLine().toCharArray();
      }

      boolean isPretty = true;
      for (int i = 0; i < 3; i++) {
         isPretty = checkLine(i, matrix);
         if (!isPretty) {
            break;
         }
      }

      System.out.println(isPretty ? "YES" : "NO");
   }

   private static boolean checkLine(int row, char[][] matrix) {
      for (int col = 0; col < 3; col++) {
         if (matrix[row][col] == matrix[row][col + 1] && matrix[row + 1][col] == matrix[row][col]
               && matrix[row][col] == matrix[row + 1][col + 1]) {
            return false;
         }
      }
      return true;
   }
}