public class LearningStatic {
    public static void main(String[] args) {
        Person p1 = new Person("Muhammed", 15);
        Person p2 = new Person("Alex", 28);
        Person p3 = new Person("Bob", 30);
        
        Person.printNumberOfHuman();

    }

    static class Person {
        private String name;
        private int age;
        private static int countHuman = 0;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
            countHuman++;
        }

        public static void printNumberOfHuman() {
            System.out.println("Number of Human: " + countHuman);
        }
    }
}
