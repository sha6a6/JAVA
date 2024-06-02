// trying to pass argument in my method

public class passArg{
  public static void addCost(int item1, int item2){
    int added = item1+item2;
    System.out.println("Total "+added);
  }
  public static void main(String args[]){
    addCost(10,20);
  }
}