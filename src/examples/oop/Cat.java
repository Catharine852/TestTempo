package examples.oop;

public class Cat {
    String name;
    String color;
    private int age;

    public int getAge () {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
        this.age = 0;
    } else {
            this.age = age;
        }
    }

    public  Cat (String name, String color, int age) {
        this.name = name;
        this.color = color;
        if (age < 0) {
            this.age = 0;
        } else this.age = age;
    }
    public  Cat () {}

    String meow () {
       return "MEEEEEOOWWW! I ame " + name +" with " + color + " color. And I am " +
               + age + " years old.";
    }
    void cat (String food, int times) {
        for (int i = 0; i < times; i++) {
        System.out.println("I'm eating " + food + "...");
    }
}
}

