import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] grades = new int[5];
        int[] a;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            grades[a[i]-1]++;
        }
        for (int i = 1; i < 5; i++) {
            System.out.print(grades[i] + " ");
        }
    }
}