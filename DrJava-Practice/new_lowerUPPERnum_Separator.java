import java.util.Scanner;
// new method is easier to remmeber
public class new_lowerUPPERnum_Separator{
  public static void main(String args[]){
    System.out.println("Enter your content to identify by case:"+"\n"+"(Numbers and Spaces will be skipped)");
    Scanner hold = new Scanner(System.in);
    String var = hold.nextLine();
    for (int i = 0; i < var.length(); i++){
      if (var.charAt(i)>= 'a' && var.charAt(i) <= 'z'){
        System.out.println("lowers--> "+var.charAt(i));
        }
      else{
        if (var.charAt(i)>='A' && var.charAt(i) <= 'Z'){
          System.out.println("CAPS--> "+var.charAt(i));
        }
        else if (var.charAt(i)>='0' && var.charAt(i) <= '9'){
          System.out.println("Numbers--> "+var.charAt(i));
        }
      }
    }
  }
}