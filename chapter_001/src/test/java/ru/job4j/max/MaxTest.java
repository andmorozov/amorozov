package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Andrey morozov (bull13166@bk.ru)
* @version 1.0
* @since 18.11.2017
*/
public class MaxTest {
	/**
	* Тест операции поиска максимума.
	*/ 
	@Test
	public void whenFirstLessSecond() {
		Max maxim = new Max();
		int result = maxim.max(1, 2);
		assertThat(result, is(2));
	}
}