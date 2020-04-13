import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if( h <= a) {
            System.out.println(1);
        } else {
            int days = (h-a) / (a-b) + 1;
            if (((h-a) % (a-b)) != 0) days++;
            System.out.println(days);
        }
    }
}