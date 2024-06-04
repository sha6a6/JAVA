// TASK 1

import java.util.Scanner;

public class Task1{
  public static void main(String [] args){
    // 1A
    int var1 = 10;
    System.out.println("Stored: "+var1);
    // 1B
    int var2 = 5;
    var1 +=  var2;
    System.out.println("Addition Result: "+var1);
    // 1C
    System.out.println("Product: "+var1*var2+" \nDivision: "+var1/var2);
    // 1D
    double num1 = 10;
    System.out.println("Stored: "+num1);
    double num2 = 5;
    num1 +=  num2;
    System.out.println("Addition Result: "+num1);
    System.out.println("Product: "+num1*num2+" \nDivision: "+num1/num2);
    // 1E
    double doub1 = 10;
    System.out.println("Stored: "+doub1);
    int inte2 = 5;
    doub1 +=  inte2;
    System.out.println("Addition Result: "+doub1);
    System.out.println("Product: "+doub1*inte2+" \nDivision: "+doub1/inte2);
    // 1F
    String str1 = "10";
    System.out.println("Stored: "+str1);
    String str2 = "5";
    str1 += str2;
    System.out.println("Addition Result: "+str2);
    System.out.println("Addition Operator"+" joins"+" String."+" Unlike calculating, which is done for integer or double etc.");
    System.out.println("The integer is converted to a String before the joining and vice versa.");
    // 1G
    System.out.println("Enter a number: ");
    Scanner hold1 = new Scanner(System.in);
    int data1 = hold1.nextInt();
    System.out.println("Stored: "+data1);
    System.out.println("Enter another number: ");
    Scanner hold2 = new Scanner(System.in);
    int data2 = hold2.nextInt();
    data1 +=  data2;
    System.out.println("Addition Result: "+data1);
  }
}