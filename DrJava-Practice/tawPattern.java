import java.util.Scanner;

public class tawPattern {
    public static void main(String args[]) {
        Scanner hold = new Scanner(System.in);
        int num = hold.nextInt();
        for (int line = 1; line <= num; line++) {    // outer loop diye koy line print hobe set kori
            for (int col = 1; col <= num; col++) {   // inner loop diye content ki hobe set kori
                System.out.print(col);
            }
            System.out.println();
        } 
    }
}