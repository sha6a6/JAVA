import java.util.Scanner;
class Condition{
  public static void main(String args[]){
    System.out.println("Please Enter a Number Greater than 9:");
    Scanner hold = new Scanner(System.in);
    int show = hold.nextInt();
    if (show >= 10){
      System.out.println(show);
  }
    else{
      System.out.println("You Noob!!!");
    }
  }
}