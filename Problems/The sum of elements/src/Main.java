import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}