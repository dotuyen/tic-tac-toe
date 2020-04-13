import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();
        boolean contain = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == num) {
                contain = true;
                break;
            }
        }
        System.out.println(contain);
    }
}