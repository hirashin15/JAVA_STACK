public class fizzBuzz {
  public String fizzBuzz(int number) {
    String message = "";
    if(number%5 == 0 && number%3 == 0){
      message += "FizzBuzz";
    } else if (number%5 == 0 && number%3 != 0){
      message += "Buzz";
    } else if (number%5 != 0 && number%3 == 0){
      message += "Fizz";
    } else {
      message += number;
    }
    return message;
  }
}