package ru.job4j.condition;
/**
* Class Point решение задачи части 001 урок 3.2 Положение точки
*
* @author Andrey Morozov (bull13166@bk.ru)
* @version 1.0
* @since 18.11.2017
*/
public class Point {
   /**
    * @param x координата x
	* @param y координата y
    */
   private int x;
   private int y;
	/**
    * Конструктор класса Point
    */
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
	}
	/**
    * геттер параметра x
    */
	public int getX() {
      return this.x;
	}
	/**
    * геттер параметра y
    */
	public int getY() {
     return this.y;
	}
	/**
    * Проверка на максимум
    */
	public boolean is(int a, int b) {
		boolean ifIs = (getY() == a * getX() + b);
    return ifIs; 
	} 
}