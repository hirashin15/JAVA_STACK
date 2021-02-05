public class stringManipulator {
  public String trimAndConcat(String first, String second) {
    String newString = "";
    return newString += first.trim() + " " + second.trim();
  }

  public Integer getIndexOrNull(String word, char letter) {
    if (word.contains(String.valueOf(letter))) {
      return word.indexOf(String.valueOf(letter));
    } else {
      return null;
    }
  }

  public Integer getIndexOrNull(String first, String second) {
    if (first.contains(second)) {
      return first.indexOf(second);
    } else {
      return null;
    }
  }

  public String concatSubstring(String first, int startI, int endI, String second) {
    String word = "";
    word += first.substring(startI, endI) + second;
    return word;
  }
}