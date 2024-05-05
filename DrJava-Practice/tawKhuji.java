import java.util.Scanner;

public class tawKhuji{
  public static void main(String args[]){
    System.out.println("Enter a number within 10:");
    Scanner hold = new Scanner(System.in);
    int id = hold.nextInt();
    for (int i = 1; i <= 10; i++){
      if (i == id){
        System.out.print(i+" --> Khuje peyechi");
        break;  // break er jaygay continue use korle loop na theme just oi specific ta skip hobe
      }
      System.out.println(i);
    }
    System.out.println("\n...Loop Bondho...");
  }
}