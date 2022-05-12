import java.util.Scanner;

public class IfJudge {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.print("Please input your score: ");
        int n = score.nextInt();
        if (n >= 90) {
            System.out.println("Congratulations! your score is excellent!");
        } else if (n >= 60) {
            System.out.println("Luckily, you passed this exam.");
        } else {
            System.out.println("Sadly,  you didn't pass this exam.");
        }
        System.out.println("END");
    }
}
