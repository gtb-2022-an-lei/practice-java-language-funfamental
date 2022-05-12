import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your name: ");
        String name = scanner.nextLine();
        System.out.print("Please input your age: ");
        int age = scanner.nextInt();
        System.out.printf("Hi, %s, you are %d years old\n", name, age);
    }
}
