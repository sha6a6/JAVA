// make method. send an array. find odd.

public class MethodOdd{
  public static void oddFinder(int [] a1){
    for(int i = 0; i<a1.length; i++){
      if (a1[i]%2 != 0){
        System.out.println(a1[i]);
      }
    }
  }
  public static void main(String [] args){
    System.out.println("Inside main method");
    int [] arr1 = {11, 12, 13, 14, 15};
    oddFinder(arr1);
  }
}