interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}

public class Main {
    public static void main(String[] args) {
        var myDog = new Dog(); 
        myDog.makeSound();
    }
}
