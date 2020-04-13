import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "rectangle" : {
                float a = scanner.nextFloat();
                float b = scanner.nextFloat();
                System.out.println(a * b);
                break;
            }
            case "circle" : {
                float r = scanner.nextFloat();
                System.out.println(3.14 * r * r);
                break;
            }
            case "triangle" : {
                float a = scanner.nextFloat();
                float b = scanner.nextFloat();
                float c = scanner.nextFloat();
                System.out.println(Math.sqrt((a + b +c) * (a + b -c) * (b + c - a) * (c + a - b)) / 4);
                break;
            }
        }
    }
}