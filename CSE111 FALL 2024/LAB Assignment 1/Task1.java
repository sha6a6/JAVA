// TASK 1

import java.util.Scanner;

public class Task1{
  public static void main(String [] args){
    int count = 0;
    int avgCount = 0;
    int user = 0;
    int sum=0;
    int min = 0;
    int max = 0;
    Scanner hold = new Scanner(System.in);
    while (count < 10){
      count++;
      user = hold.nextInt();
      if (user > 0 && user % 2 != 0){
        avgCount++;
        sum += user;
        if (user > max){
          max = user;
        }
        if (user < max){
          min = user;
        }
      }
    }
    double avg = (double)sum/avgCount;
    System.out.println("Sum: "+ sum);
    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
    System.out.println("Average: " + avg);
  }
}