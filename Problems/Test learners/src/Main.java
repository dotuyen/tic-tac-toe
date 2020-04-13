import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        System.out.println("what programming language are you learning here?");
//        System.out.println("1. Java");
//        System.out.println("2. Kotlin");
//        System.out.println("3. Scala");
//        System.out.println("4. Python");

        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        try {
            ans = scanner.nextInt();
            if (ans < 1 || ans > 4) {
                System.out.println("Unknown number");
            } else {
                System.out.println(ans == 1 ? "Yes!" : "No!");
            }
        } catch (NumberFormatException num) {
            System.out.println("Unknown number");
        }

    }
}