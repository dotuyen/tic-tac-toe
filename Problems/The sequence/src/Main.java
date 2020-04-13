import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;
        int index = 1;
        while (count <= n) {
            int j = 0;
            while (j < index && count <= n) {
                System.out.print(index + " ");
                count++;
                j++;
            }
            index++;
        }
    }
}