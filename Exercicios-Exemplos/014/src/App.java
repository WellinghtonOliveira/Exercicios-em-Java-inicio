class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: oinc oinc");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: au au");
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Animal  myAnimal = new Animal(); // Cria um obj animal
        Animal myPig = new Pig(); // Cria um obj Pig
        Animal myDog = new Dog(); // Cria um obj dog

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

    }
}
