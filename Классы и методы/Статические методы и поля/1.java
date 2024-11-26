/**
 * Практика #1 Приведите все варианты вызова метода printVars()
 */
1. Прямой вызов из другого статического метода в том же классе:
   public class A {
       public static int a = 1;
       public static int b;

       public static void printVars() {
           System.out.println(a);
           System.out.println(b);
       }

       public static void main(String[] args) {
           printVars();
       }
   }

2. Вызов из другого класса:
   public class Main {
       public static void main(String[] args) {
           A.printVars(); // Вызов статического метода через имя класса
       }
   }

3. Вызов из нестатического метода другого класса:
   public class Main {
       public void someMethod() {
           A.printVars(); // Вызов статического метода через имя класса
       }

       public static void main(String[] args) {
           Main mainInstance = new Main();
           mainInstance.someMethod(); // Вызов нестатического метода, который вызывает printVars()
       }
   }

4. Вызов из статического блока:
   public class A {
       public static int a = 1;
       public static int b;

       public static void printVars() {
           System.out.println(a);
           System.out.println(b);
       }

       static {
           printVars(); // Вызов метода из статического блока
       }

       public static void main(String[] args) {
           // Пусто, так как printVars() уже вызван в статическом блоке
       }
   }
