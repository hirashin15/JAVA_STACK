import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class puzzleJava{
  public String greaterThan10(){
    ArrayList<Integer> arrList = new ArrayList<Integer>();
    int[] arr = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
    int sum = 0;
    for(Integer item : arr){
      if(item > 10){
        arrList.add(item);
      }
      sum += item;
    }
    System.out.println(sum);
    arrList.toArray();
    return "her";
  }

  public String names(){
    ArrayList<String> arrList = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
    Collections.shuffle(arrList);
    ArrayList<String> nameArrList = new ArrayList<String>();
    for(String name : arrList){
      System.out.println(name);
      if(name.length() > 5){
        nameArrList.add(name);
      }
    }
    return Arrays.toString(nameArrList.toArray());
  }

  public void alphabet(){
    String alpha = "abcdefghijklmnopqrstuvwxyz";
    ArrayList<Character> alphaList = new ArrayList<Character>();
    for(char c : alpha.toCharArray()){
      alphaList.add(c);
    }
    Collections.shuffle(alphaList);
    String first = String.valueOf(alphaList.get(0));
    String last = String.valueOf(alphaList.get(25));

    System.out.println("First: "+first+" Last: "+last);
    if ((first == "a") || (first == "e") || (first == "i") || (first == "o") || (first == "u") || (first == "y")){
      System.out.println("You got a vowel!");
    }
  }

  public int[] randomInt(){
    Random r = new Random();
    int[] arr = new int[10];
    for(int i = 0; i < 10; i++){
      arr[i] = r.nextInt(101-55)+55;
    }
    return arr;
  }
  public Object[] randomIntSort(){
    Random r = new Random();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i = 0; i < 10; i++){
      Integer intObj = new Integer(r.nextInt(101-55)+55);
      arr.add(intObj);
    }
    Collections.sort(arr);
    return arr.toArray();
  }

  public String randString(){
    Random r = new Random();
    String str = "";
    for(int i = 0; i<5; i++){
      int num = r.nextInt(123-97)+98;
      str += (char) num;
    }
    return str;
  }

  public String randString10(){
    Random r = new Random();
    String str = "";
    for(int i = 0; i<10; i++){
      for(int j = 0; j<5; j++){
        int num = r.nextInt(122-97)+98;
        str += (char) num;
      }
    }
    return str;
  }
}