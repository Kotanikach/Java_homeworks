/**
 * Практика #1 Приведите примеры использования различных спецификаторов доступа для внутренних классов и объясните их поведение.
 */
class OuterClass {
    // Внешний класс
    private String outerField = "Outer field";

    // Приватный внутренний класс
    private class PrivateInner {
        void display() {
            System.out.println("Accessing from PrivateInner: " + outerField);
        }
    }

    // Публичный внутренний класс
    public class PublicInner {
        void display() {
            System.out.println("Accessing from PublicInner: " + outerField);
        }
    }

    // Защищенный внутренний класс
    protected class ProtectedInner {
        void display() {
            System.out.println("Accessing from ProtectedInner: " + outerField);
        }
    }

    // Метод внешнего класса для создания экземпляра внутреннего класса
    public void createInnerInstances() {
        PrivateInner privateInner = new PrivateInner();
        privateInner.display();

        PublicInner publicInner = new PublicInner();
        publicInner.display();

        ProtectedInner protectedInner = new ProtectedInner();
        protectedInner.display();
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerInstances();
    }
}
/*
Внешний класс (OuterClass):
Содержит приватное поле outerField, доступное только внутри этого класса.
Приватный внутренний класс (PrivateInner):
Объявлен с модификатором private, что означает, что он доступен только внутри OuterClass.
Публичный внутренний класс (PublicInner):
Объявлен с модификатором public, что позволяет ему быть доступным из любого другого класса.
Защищенный внутренний класс (ProtectedInner):
Объявлен с модификатором protected, что позволяет ему быть доступным в подклассах и в том же пакете.
Метод createInnerInstances():
Этот метод создает экземпляры всех трех внутренних классов и вызывает их методы display(), которые выводят значение поля outerField.
Класс Main:
В методе main создается экземпляр внешнего класса и вызывается метод для создания экземпляров внутренних классов.*/
