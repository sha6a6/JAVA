import java.util.Scanner;

class userLargestNum{
  public static void main(String args []){
    int maxVal = 0;
    Scanner hold = new Scanner(System.in);
    for (int i = 1; i < 6; i++){
      System.out.println("Enter a Number:");
      int given = hold.nextInt();
      if (i == 1){
        maxVal = given;
        System.out.println(maxVal+" is the largest number given by the user so far.");
      }
      else{
        if (maxVal < given){
          maxVal = given;
          System.out.println(maxVal+" is the largest number given by the user so far.");
        }
        else if (maxVal == given || maxVal > given){
          System.out.println(maxVal+" is the largest number given by the user so far.");
        }
          }
      }
    }
  }