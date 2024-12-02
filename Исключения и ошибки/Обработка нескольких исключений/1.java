//Практика #1 Приведите пример кода, в котором продемонстрированы следующие ситуации: несколько исключений обрабатываются абсолютно идентичным образом; исключения, которые обрабатываются, образуют иерархию Ex1 <|-- Ex2 <|-- Ex3, т.е. Ex3 - подкласс Ex2, а Ex2 - подкласс Ex1.

class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Main {

    public static void main(String[] args) {
        try {
            methodThatThrowsExceptions();
        } catch (Ex3 e) { // Сначала ловим самый специфичный тип
            System.out.println("Перехвачено исключение типа Ex3: " + e.getClass().getSimpleName());
        } catch (Ex2 e) { // Затем ловим более общий тип
            System.out.println("Перехвачено исключение типа Ex2: " + e.getClass().getSimpleName());
        } catch (Ex1 e) { // И только потом самый общий тип
            System.out.println("Перехвачено исключение типа Ex1: " + e.getClass().getSimpleName());
        }

        // Обработка нескольких исключений идентичным образом
        try {
            methodThatThrowsMultipleExceptions();
        } catch (Ex1 e) { // Обрабатываем только Ex1 здесь
            System.out.println("Перехвачено исключение типа Ex1: " + e.getClass().getSimpleName());
        }
    }

    public static void methodThatThrowsExceptions() throws Ex1 {
        throw new Ex3(); // Генерация исключения типа Ex3
    }

    public static void methodThatThrowsMultipleExceptions() throws Ex1 {
        throw new Ex2(); // Генерация исключения типа Ex2
    }
}
