/**
 * Практика #1: Приведите примеры использования методы decode().
 */
public class Main {
    public static void main(String[] args) {
        Integer decimal = Integer.decode("123");
        Integer hex = Integer.decode("0x7B");

        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + hex);
    }
}
