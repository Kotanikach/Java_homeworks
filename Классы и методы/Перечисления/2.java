/**
 * Практика #2 Приведите примеры реализации собственного перечисления c любым дополнительным методом.
 */
public enum Day {
    MONDAY("Рабочий"),
    TUESDAY("Рабочий"),
    WEDNESDAY("Рабочий"),
    THURSDAY("Рабочий"),
    FRIDAY("Рабочий"),
    SATURDAY("Выходной"),
    SUNDAY("Выходной");

    private final String type; 

    private Day(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public boolean isWorkingDay() {
        return this.type.equals("Рабочий");
    }
}

public class Main {
    public static void main(String[] args) {
        // Перебор всех дней недели
        for (Day day : Day.values()) {
            System.out.println(day + " - " + day.getType() + 
                               (day.isWorkingDay() ? " (рабочий день)" : " (выходной)"));
        }
    }
}
