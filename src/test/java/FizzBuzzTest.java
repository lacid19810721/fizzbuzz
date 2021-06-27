import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_1_given() {
        // arrange (데이터셋업)
        FizzBuzz fizzBuzz = new FizzBuzz();
        // act(코드실행)
        String result = fizzBuzz.play("1");

        assertEquals("1", result);
    }

}
