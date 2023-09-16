import java.util.ArrayList;
import java.util.Scanner;

class Animal {
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}

public class lab32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animalList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for Animal " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter weight for Animal " + (i + 1) + ": ");
            double weight = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            Animal animal = new Animal(name, weight);
            animalList.add(animal);
        }

        Animal heaviestAnimal = findHeaviestAnimal(animalList);

        if (heaviestAnimal != null) {
            System.out.println(heaviestAnimal.getName() + " is " + heaviestAnimal.getWeight());
        } else {
            System.out.println("No animals in the list.");
        }

        scanner.close();
    }

    public static Animal findHeaviestAnimal(ArrayList<Animal> animals) {
        if (animals.size() == 0) {
            return null;
        }

        Animal heaviest = animals.get(0);
        for (int i = 1; i < animals.size(); i++) {
            if (animals.get(i).getWeight() > heaviest.getWeight()) {
                heaviest = animals.get(i);
            }
        }

        return heaviest;
    }
}
