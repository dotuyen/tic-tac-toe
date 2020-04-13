package tictactoe;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
//      System.out.print("Enter cells: ");
//      String data = scanner.nextLine();
//      char[] charData = data.toCharArray();
      char[][] matrix = new char[3][3];
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            matrix[i][j] = ' ';
         }
      }
      int countX = 0;
      int countO = 0;
      int countSpace = 9;
      int turn = 0;
      int state = 3;
      while (state == 3) {
         printMatrix(matrix);
         if (turn % 2 == 0) {
            turnNext('X', matrix, scanner);
         } else {
            turnNext('O', matrix, scanner);
         }
         state = getState(matrix, countSpace);
         turn++;
         countSpace--;
      }
      printMatrix(matrix);
      printResult(state);

//      for (int i = 0; i < 3; i++) {
//         for (int j = 0; j < 3; j++) {
//            matrix[i][j] = charData[i * 3 + j];
//            if ('X' == matrix[i][j]) {
//               countX++;
//            } else if ('O' == matrix[i][j]) {
//               countO++;
//            } else {
//               countSpace++;
//            }
//         }
//      }
//      printMatrix(matrix);

//        if (Math.abs(countO - countX) > 1) {
//            System.out.println("Impossible");
//        } else {
//            String state = getState(matrix, countSpace);
//            System.out.println(state);
//        }


//      printMatrix(matrix);

   }

   private static void printResult(int state) {
      switch (state) {
         case 0:
            System.out.println("Impossible");
            break;
         case 1:
            System.out.println("O wins");
            break;
         case 2:
            System.out.println("X wins");
            break;
         case 3:
            System.out.println("Game not finished");
            break;
         case 4:
            System.out.println("Draw");
            break;
      }
   }

   private static void turnNext(char target, char[][] matrix, Scanner scanner) {
      boolean stop = false;
      int x1 = -1;
      int y1 = -1;
      while (!stop) {
         System.out.println("Enter the coordinates: ");
         try {
            String line = scanner.nextLine();
            String[] input = line.split(" ");
            x1 = Integer.parseInt(input[0]) - 1;
            y1 = Math.abs(3 - Integer.parseInt(input[1]));
         } catch (NumberFormatException numberE) {
            System.out.println("You should enter numbers!");
         }

         if (x1 < 0 || x1 > 2 || y1 < 0 || y1 > 2) {
            System.out.println("Coordinates should be from 1 to 3!");
         } else if (matrix[y1][x1] == 'X' || matrix[y1][x1] == 'O') {
            System.out.println("This cell is occupied! Choose another one!");
         } else {
            matrix[y1][x1] = target;
            stop = true;
         }
      }
   }

   private static void printMatrix(char[][] matrix) {
      System.out.println("---------");
      for (int i = 0; i < 3; i++) {
         System.out.print("| ");
         for (int j = 0; j < 3; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.print("|");
         System.out.println();
      }
      System.out.println("---------");
   }

   private static int getState(char[][] matrix, int countSpace) {
      boolean xWins = isWins(matrix, 'X');
      boolean oWins = isWins(matrix, 'O');
      if (xWins && oWins)
         return 0; // state = "Impossible";
      if (!xWins && oWins)
         return 1; // state = "O wins";
      if (xWins && !oWins)
         return 2; // state = "X wins";
      if (!xWins && !oWins && countSpace > 0)
         return 3; // state = "Game not finished";
      return 4; // "Draw";

   }

   private static boolean isWins(char[][] matrix, char target) {
      // check rows
      for (int i = 0; i < 3; i++) {
         if (matrix[i][0] == target && matrix[i][1] == target && matrix[i][2] == target) {
            return true;
         }
      }
      // check cols
      for (int i = 0; i < 3; i++) {
         if (matrix[0][i] == target && matrix[1][i] == target && matrix[2][i] == target) {
            return true;
         }
      }
      // check diagonal
      if (matrix[0][0] == target && matrix[1][1] == target && matrix[2][2] == target) {
         return true;
      }
      if (matrix[0][2] == target && matrix[1][1] == target && matrix[2][0] == target) {
         return true;
      }
      return false;
   }
}
