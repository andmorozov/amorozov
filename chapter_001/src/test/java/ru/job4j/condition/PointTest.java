package ru.job4j.condition;

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
public class PointTest {
	/**
	* Тест операции нахождения принадлежности точки графику функции.
	*/ 
	@Test
    public void whenPointOnLineThenTrue() {
        //create of new point.  
        Point point = new Point(1, 1);
        // execute method - is and get result;
        boolean rsl = point.is(0, 1);
        // assert result by excepted value.
        assertThat(rsl, is(true));
   }
}