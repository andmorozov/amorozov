package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Andrey morozov (bull13166@bk.ru)
* @version 1.0
* @since 17.11.2017
*/
public class CalculateTest {
	/**
	* Test echo.
	*/ 
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Andrey Morozov";
		String expect = "Echo, echo, echo : Andrey Morozov"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
 
}