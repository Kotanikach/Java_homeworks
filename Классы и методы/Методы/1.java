/**
 * Практика #1 Приведите примеры использования перегрузки и переопределения методов.
 */
class MathOperations {
    // Перегруженный метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        System.out.println("Сложение двух целых: " + math.add(5, 10)); // 15
        System.out.println("Сложение трех целых: " + math.add(5, 10, 15)); // 30
        System.out.println("Сложение двух дробных: " + math.add(5.5, 10.5)); // 16.0
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound(); // Собака лает
        myCat.makeSound(); // Кошка мяукает
    }
}
