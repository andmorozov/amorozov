package ru.job4j.max;
/**
* Class Max решение задачи части 001 урок 2.3 Элементарный калькулятор
*
* @author Andrey Morozov (bull13166@bk.ru)
* @version 1.0
* @since 18.11.2017
*/
public class Max {
	/**
     * Поиск максимального значения.
	 * @param first первый аргумент
	 * @param second второй аргумент
	 * @param result результат
	 */
	public int max(int first, int second) {
		int result = first > second ? first : second;
		return result;
	}
}