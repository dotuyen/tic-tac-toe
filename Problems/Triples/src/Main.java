import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 2; i++) {
            int sub1 = a[i + 2] - a[i + 1];
            int sub2 = a[i + 1] - a[i];
            if (sub1 == 1 && sub2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}