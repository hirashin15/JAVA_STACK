public class stringManipulatorTesting {
  public static void main(String[] args) {
    stringManipulator manipulator = new stringManipulator();

    // Trim and Concat
    String str = manipulator.trimAndConcat("    Hello     ","     World    ");
    System.out.println(str); // HelloWorld 

    // Index of char in string
    char letter = 'o';
    Integer a = manipulator.getIndexOrNull("Coding", letter);
    Integer b = manipulator.getIndexOrNull("Hello World", letter);
    Integer c = manipulator.getIndexOrNull("Hi", letter);
    System.out.println(a); // 1
    System.out.println(b); // 4
    System.out.println(c); // null

    // Index of substring in string
    String word = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer d = manipulator.getIndexOrNull(word, subString);
    Integer e = manipulator.getIndexOrNull(word, notSubString);
    System.out.println(d); // 2
    System.out.println(e); // null

    // Concat substring of one word with another word
    String result = manipulator.concatSubstring("Hello", 1, 2, "world");
    System.out.println(result); // eworld
  }
}