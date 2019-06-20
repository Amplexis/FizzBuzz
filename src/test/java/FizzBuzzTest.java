import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void Setup(){
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void whenPassedANumberFizzBuzzWillReturnThatNumber(){
        assertEquals("1", fizzBuzz.fizz(1));

    }

    @Test
    public void whenPassedTheNumberTwoFizzBuzzWillReturnATwo(){
        assertEquals("2", fizzBuzz.fizz(2));
    }

    @Test
    public void whenPassedTheNumberThreeFizzBuzzWillReuturnTheStringFizz(){
        assertEquals("Fizz!", fizzBuzz.fizz(3));
    }

    @Test
    public void whenPassedAMultipleOfThreeFizzBuzzWillReturnStringFizz(){
        assertEquals("Fizz!", fizzBuzz.fizz(6));
        assertEquals("Fizz!", fizzBuzz.fizz(27));
    }

}