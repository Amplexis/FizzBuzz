
public class FizzBuzz {
    public String fizz(Integer inputNumber) {
        boolean result = FizzBuzzMethods.modThree(inputNumber);
        String message;
        if (result == true){
            message = "Fizz!";
        } else {
            message = inputNumber.toString();
        }
      return message;
    }
}
