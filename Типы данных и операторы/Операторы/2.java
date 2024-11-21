/**
 * Практика #2: Приведите примеры использования оператора instanceof. Отдельно рассмотрите случай, когда оператор применятся к null-объекту.
 */
public class Main {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Integer number = 25;

        boolean is_string = text instanceof String;
        boolean is_integer = number instanceof Integer;
        System.out.println("text instanceof String: " + is_string);
        System.out.println("number instanceof Integer: " + is_integer);

        String null_string = null;
        boolean is_null_string = null_string instanceof String;
        System.out.println("null instanceof String: " + is_null_string);
    }
}
