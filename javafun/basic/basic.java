import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
public class basic {
  // Print 1-255
  public void print1To255() {
    for(int i = 0; i < 255; i++){
      System.out.println(i+1);
    }
  }

  // Print odd numbers b/w 1-255
  public void printOdd1To255(){
    for(int i = 1; i < 256; i++){
      if (i%2==1){
        System.out.println(i);
      }
    }
  }

  // Prints continual sum
  public void printSum(){
    int sum = 0;
    for(int i = 0; i < 256; i++){
      sum += i;
      System.out.println("New number: " + i + " Sum: " + sum);
    }
  }

  // Iterating through an array
  public void iterateArray(Object[] arr){
    for(Object item : arr){
      System.out.println(item);
    }
  }

  public void findMax(Integer[] arr){
    Integer current = Integer.MIN_VALUE;
    for(Integer item : arr){
      if (item > current) {
        current = item;
      }
    }
    System.out.println(current);
  }

  // Get Average
  public void getAverage(int[] arr){
    int sum = 0;
    int length = arr.length;
    for(int item : arr){
      sum += item;
    }
    int avg = sum/length;
    System.out.println(avg);
  }

  // Array with odd numbers
  public void arrayOfOdd(){
    ArrayList<Integer> y = new ArrayList<Integer>();
    for(int i = 1; i < 256; i++){
      if(i%2!=0){
        y.add(i);
      }
    }
    System.out.println(y);
  }

  // Greater than Y
  public void greaterThanY(int[] arr, int y){
    int count = 0;
    for(int number : arr){
      if (number > y){
        count++;
      }
    }
    System.out.println("The total number of numbers greater than y is: "+count);
  }

  // Square the values
  public void squareTheValues(int[] arr){
    ArrayList<Integer> arrList = new ArrayList<Integer>();
    for(int item : arr){
      arrList.add(item * item);
    }
    System.out.println(arrList);
  }

  // Eliminate Negative Numbers
  public void noNegNums(Integer[] arr){
    ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
    for(Integer i=0; i<arrList.size(); i++){
      if(arrList.get(i) < 0){
        arrList.set(i, 0);
      }
    }
    System.out.println(arrList);
  }

  // Max, Min, and Average
  public String maxMinAvg(int[] arr){
    int min = arr[0];
    int max = arr[0];
    int sum = 0;
    for(int i = 0; i<arr.length; i++){
      if (arr[i] > max){
        max = arr[i];
      }
      if (arr[i] < min){
        min = arr[i];
      }
      sum += arr[i];
    }
    int avg = sum/arr.length;
    int[] result = new int[]{max, min, avg};
    return Arrays.toString(result);
  }

  // Shifting the values in the array 
  public void shiftValues(int[] arr){
    for(int i = 0; i < arr.length-1; i++){
      arr[i] = arr[i+1];
    }
    arr[arr.length-1] = 0;
    System.out.println(Arrays.toString(arr));
  }
}