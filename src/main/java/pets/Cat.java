package pets;

public class Cat extends Pet{

    public Cat(String name, String petType) {
        super(name, petType);
    }

    @Override
    public void speak() {
        System.out.println("Meow ");
    }
}
