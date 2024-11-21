/**
 * Класс для выполнения математических операций.
 * 
 * @author Ваше Имя
 * @version 1.0
 */
public class MathOperations {

    /**
     * Метод для сложения двух чисел.
     *
     * @param a Первое число
     * @param b Второе число
     * @return Сумма двух чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Метод для вычитания двух чисел.
     *
     * @param a Первое число
     * @param b Второе число
     * @return Разность двух чисел
     */
    public int subtract(int a, int b) {
        return a - b;
    }
  
  //Главная функция вызова для проверки функционала
    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(subtract(3,1));
    }
}

