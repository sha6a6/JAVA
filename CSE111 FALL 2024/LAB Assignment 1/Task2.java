// TASK 2

import java.util.Scanner;

public class Task2{
  public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    int start = scanner.nextInt();
    int end = scanner.nextInt();
    int primeCount = 0;
    for (int num = start; num <= end; num++) {
      if (num > 1) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
          if (num % i == 0) {
            isPrime = false;
            break;
          }
        }
        if (isPrime) {
          primeCount++;
        }
      }
    }
    System.out.println("There are "+ primeCount + " prime numbers between " + start + " and " + end + ".");
  }
}