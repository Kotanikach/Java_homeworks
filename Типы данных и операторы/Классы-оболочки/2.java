/**
 * Практика #2: Приведите все способы создания экземпляра класса Boolean.
 */
public class Main {
    public static void main(String[] args) {
        Boolean bool1 = true;

        Boolean bool2 = Boolean.valueOf(true);
        Boolean bool3 = Boolean.valueOf("true");
        /*
        устаревший способ

        Boolean bool4 = new Boolean(true);
        Boolean bool5 = new Boolean("true");
        */

        boolean bool6 = Boolean.parseBoolean("true");
    }
}
