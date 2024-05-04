import java.util.Scanner;

public class userNumPattern {
    public static void main(String args[]) {
        System.out.println("Enter a Number:");
        Scanner hold = new Scanner(System.in);
        int stor = hold.nextInt();
        int c = 0;
        while (c < stor) {
            c += 1;
            System.out.println("");
            for (int i = 1; i <= stor; i++) {
                System.out.print(i);
            }
        }
    }
}