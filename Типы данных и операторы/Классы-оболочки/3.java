/**
 * Практика #3: В каком случае при автоупаковке/автораспаковке будет брошено исключение NullPointerException. Приведите пример.
 *
 */
public class Main {
    public static void main(String[] args) {
        Integer null_integer = null;
        try {
            int value = null_integer;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException пойман: " + e.getMessage());
        }
    }
}
