import java.util.Scanner;
// lower 97-122 ; UPPER 65-90 ; numb 48-57 ; Space 32 //
public class lowerUPPER_Separator{
  public static void main(String args[]){
    System.out.println("Enter your content to identify by case:"+"\n"+"(Numbers and Spaces will be skipped)");
    Scanner hold = new Scanner(System.in);
    String var = hold.nextLine();
    for (int i = 0; i < var.length(); i++){
      if (var.codePointAt(i)>= 97 && var.codePointAt(i) <= 122){
        System.out.println("lowers--> "+var.charAt(i));
        }
      else{
      if (var.codePointAt(i)>=65 && var.codePointAt(i) <= 90){
        System.out.println("CAPS--> "+var.charAt(i));
        }
      }
    }
  }
}