// method that return sum of square of 2 numbers

public class sumOfNumSquare{
  public static int calc(int n1, int n2){
    int sq1 = n1*n1;
    int sq2 = n2*n2;
    int sum = sq1 + sq2;
    return sum;
  }
  public static void main(String [] args){
    int nums = calc(5,6);
    System.out.println("The sum is "+nums);
  }
}