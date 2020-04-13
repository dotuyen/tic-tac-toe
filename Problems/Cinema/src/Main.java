import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();

        int row = 0;
        boolean available = false;
        if (k > m) {
            System.out.println(0);
        } else {
            for (int i = 0; i < n; i++) {
                boolean bool = isAvailable(i, a, m, k);
                if (bool) {
                    available = true;
                    row = i + 1;
                    break;
                }
            }
            if (!available) {
                System.out.println(0);
            } else {
                System.out.println(row);
            }
        }
    }

    public static boolean isAvailable(int row, int[][] a, int m, int k) {
        int maxlength = 0;
        for (int j = 0; j < m; j++) {
            if (maxlength >= k) {
                return true;
            }
            if (a[row][j] == 0) {
                maxlength++;
            } else {
                maxlength = 0;
            }
        }
        if (maxlength >= k) {
            return true;
        }
        return  false;
    }
}