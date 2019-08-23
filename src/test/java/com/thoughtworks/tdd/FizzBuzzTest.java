package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.platform.commons.annotation.Testable;

public class FizzBuzzTest {
@Test void should_return_1_when_input_1() {
	Game game=new Game();
	String result=game.fizzBuzz(1);
	Assertions.assertEquals("1", result);
}
}
*@Test 
public void should_return_Fizz_when_input_3() {
	Game game=new Game();
	String result=game.fizzBuzz(3);
	Assertions.assertEquals("Fizz", result);
}
}
