package Udemy.Section6OOPS.InheritanceExample;

public class main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Ben", 6,120,2,4,1,36,"long silky");
     dog.eat();
     //dog.walk();
     dog.run();
    }
}
