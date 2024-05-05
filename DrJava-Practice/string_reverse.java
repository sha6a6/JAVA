import java.util.Scanner;

public class string_reverse{
  public static void main(String args[]){
    System.out.print("Enter a String to Reverse");
    Scanner hold = new Scanner(System.in);
    String var = hold.nextLine();
    for (int i = var.length()-1; i >= 0 ; i--){
      System.out.print(var.charAt(i));
    }
  }
}