import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void whenPassedANumberFizzBuzzWillReturnThatNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.fizz(1));

    }

    @Test
    public void whenPassedTheNumberTwoFizzBuzzWillReturnATwo(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.fizz(2));
    }


}