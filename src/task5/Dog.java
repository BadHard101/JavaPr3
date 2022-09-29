package task5;

public class Dog {
    String name = "Unknown name";
    int age = -1;

    public Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeInHuman() {
        return age*7;
    }

    @Override
    public String toString() {
        return "Dog '" + name + "' is " + age + " years old";
    }
}
