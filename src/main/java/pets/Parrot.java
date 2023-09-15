package pets;

public class Parrot extends Pet{


    public Parrot(String name, String petType) {
        super(name, petType);
    }

    @Override
    public void speak() {
        System.out.println("Human speak");
    }
}
