package pets;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets? ");
        int petNumbers = scanner.nextInt();

        List<Pet> pets = new ArrayList<>();

        for(int i = 0; i < petNumbers; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Your pet type? ");
            String petType = scanner1.next();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("...And it's name? ");
            String itsName = scanner2.next();
            switch (petType.toLowerCase()){
                case "dog":
                    Dog dog = new Dog(itsName,petType);
                    pets.add(dog);
                    break;
                case "cat":
                    Cat cat = new Cat(itsName,petType);
                    pets.add(cat);
                    break;
                case "parrot":
                    Parrot parrot = new Parrot(itsName,petType);
                    pets.add(parrot);
                    break;
                default:
                    System.out.println("Unsupported pet");
            }
        }





        for (Pet pet:pets) {
            System.out.println(pet.getName());
            System.out.println(pet.getPetType());
            pet.speak();
        }

    }
}
