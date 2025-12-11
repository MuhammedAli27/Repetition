public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Muhammed");
        person1.setAge(15);
        person1.getInfo();
        int year1 = person1.calculateYearsToRetirement();
        System.out.println("Years to Retirement: " + year1);

        System.out.println();

        Person person2 = new Person();
        person2.setName("Alex");
        person2.setAge(28);
        person2.getInfo();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Years to Retirement: " + year2);
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String username) {
        if (username == null || username.isEmpty()) {
            System.out.println("Name is empty or null");
        } else {
            name = username;
        }
    }
    public void setAge(int userage) {
        if (userage < 0) {
            System.out.println("Age is negative");
        } else {
            age = userage;
        }
    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String username, int userage) {
        setName(username);
        setAge(userage);
    }

    void getInfo() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

    int calculateYearsToRetirement() {
        return 100 - age;
    }
}
