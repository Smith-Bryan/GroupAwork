package pets;

public class Dog extends Pet{


    public Dog(String name, String petType) {
        super(name, petType);
    }

    @Override
    public void speak() {
        System.out.println("Woof Woof");

    }
}
