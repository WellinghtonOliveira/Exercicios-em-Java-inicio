class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    Animal() {
        System.out.println("Animal is created");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: oinc oinc");
    }

    Pig() {
        super();
        System.out.println("Pig is created"); 
    }
}

class Dog extends Animal {
    public void animalSound() {
        super.animalSound();
        System.out.println("The dog says: au au");
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Animal  myAnimal = new Animal(); // Cria um obj animal
        Animal myPig = new Pig(); // Cria um obj Pig
        Animal myDog = new Dog(); // Cria um obj dog

        // myAnimal.animalSound();
        // myPig.animalSound();
        // myDog.animalSound();

    }
}
