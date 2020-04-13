import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int[] partTypes = new int[3];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            partTypes[scanner.nextInt() + 1]++;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(partTypes[(i + 1) % 3] + " ");
        }
    }
}