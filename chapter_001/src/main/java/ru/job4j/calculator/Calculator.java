package ru.job4j.calculator;
/**
* Class Calculator решение задачи части 001 урок 2.3 Элементарный калькулятор
*
* @author Andrey Morozov (bull13166@bk.ru)
* @version 1.0
* @since 18.11.2017
*/
public class Calculator {
	/**
	 * @param result результат
	 */
	private double result;
	/**
     * Сложение.
	 * @param first первый аргумент
	 * @param second второй аргумент
	 */
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
     * Вычитание.
	 * @param first первый аргумент
	 * @param second второй аргумент
	 */
	public void subtract(double first, double second) {
		this.result = first - second;
	}
	/**
     * Деление.
	 * @param first первый аргумент
	 * @param second второй аргумент
	 */
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
     * Умножение.
	 * @param first первый аргумент
	 * @param second второй аргумент
	 */
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	 * @return результат
	 */
	public double getResult() {
		return this.result;
	}	
	
}