public class codePointAt{
  public static void main(String args[]){
    String var = "Ca";
    int asc1 = var.codePointAt(0);
    int asc2 = var.codePointAt(1);
    System.out.println(var.charAt(0)+" --> "+asc1);
    System.out.println(var.charAt(1)+" --> "+asc2);
    System.out.println();
  }
}