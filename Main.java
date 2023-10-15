public class Main {
    public static void main(String[] args) {
        // Variables and data types
        int age = 25;
        double weight = 65.5;
        char grade = 'A';
        boolean isStudent = true;

        // Arithmetic operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        // Relational operators
        boolean isGreater = a > b;
        boolean isLess = a < b;
        boolean isEqual = a == b;

        // Logical operators
        boolean logicalAnd = isGreater && isLess;
        boolean logicalOr = isGreater || isLess;

        // Conditional statements
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        // Loops
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Methods
        int result = multiply(5, 3);
        System.out.println("Result: " + result);

        // Classes and objects
        Person person = new Person("Alice", 25);
        person.sayHello();
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}