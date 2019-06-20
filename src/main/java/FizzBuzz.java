
public class FizzBuzz {
    public String fizz(Integer inputNumber) {
        boolean modThreeResult = FizzBuzzMethods.modThree(inputNumber);
        boolean modFiveResult = FizzBuzzMethods.modFive(inputNumber);

        String message;
        if (modThreeResult == true && modFiveResult == true){
            message = "FizzBuzz!";
        } else if (modThreeResult == true){
            message = "Fizz!";
        } else if (modFiveResult == true) {
            message = "Buzz!";
        } else {
            message = inputNumber.toString();
        }
      return message;
    }
}
