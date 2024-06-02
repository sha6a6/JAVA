// non-void method

public class nonVoidMethod{
  public static int adder(int n1, int n2){
    int result = n1 + n2;
    return result;
  }
  public static void main(String [] args){
    int ans = adder(10, 20);
    System.out.println(ans);
  }
}