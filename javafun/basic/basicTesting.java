public class basicTesting {
  public static void main(String[] args) {
    basic myBasic = new basic();
    String[] stringArr = {"Hi", "Im", "Pikachu"};
    Integer[] integerArr = {1, -2, 3, 4, -5};
    int[] intArr = {6, 7, 8, 9, 0};


    // myBasic.print1To255();
    // myBasic.printOdd1To255();
    // myBasic.printSum();
    // myBasic.iterateArray(stringArr);
    // myBasic.iterateArray(integerArr);
    // myBasic.findMax(integerArr);
    // myBasic.getAverage(intArr);
    // myBasic.arrayOfOdd();
    // myBasic.greaterThanY(intArr, 8);
    // myBasic.squareTheValues(intArr);
    // myBasic.noNegNums(integerArr);
    // String result = myBasic.maxMinAvg(intArr);
    // System.out.println(result);
    myBasic.shiftValues(intArr);
  }
}