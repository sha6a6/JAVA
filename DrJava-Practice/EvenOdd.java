import java.util.Scanner;

class EvenOdd{
  public static void main(String args[]){
    Scanner hold = new Scanner(System.in);
    System.out.println("Please enter a number to check:");
    int check = hold.nextInt();
    if (check % 2 == 0){
      System.out.println("The provided number --> "+check+" <-- is Even");
    }
    else{
      System.out.println("The provided number --> "+check+" <-- is Odd");
    }
  }
}