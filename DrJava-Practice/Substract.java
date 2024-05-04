import java.util.Scanner;

class Substract{
 public static void main(String args[]){
  Scanner storing = new Scanner(System.in);
  double fnum, snum, ans;
  System.out.println("Please Enter the First Number");
  fnum = storing.nextDouble();
  System.out.println("Please Enter the Second Number");
  snum = storing.nextDouble();
  ans = fnum - snum;
  System.out.println(ans);
 }
}