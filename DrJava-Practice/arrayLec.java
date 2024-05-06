import java.util.Arrays;

public class arrayLec{
  public static void main(String args[]){
    int [] arr1 = {10, 20, 30, 40, 50}; // direct array newa. [size] diyeo newa jay. string thakle null, int thakle 0 etc.
    System.out.println(Arrays.toString(arr1));
    arr1[4] = 69;  // array te index onujyi value change kora jay
    System.out.println(Arrays.toString(arr1));
  }
}