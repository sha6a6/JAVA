public class methodEvenFromArray{
  public static void evenFinder(int [] v1){
    for(int i =0; i<v1.length; i++){
      if (v1[i]%2 == 0){
        System.out.println("Even --> "+v1[i]);
      }
    }
  }
  public static void main(String [] args){
    System.out.println("Inside main method.");
    int [] arr1 = {10, 11, 12, 13, 14, 15};
    evenFinder(arr1);
  }
}