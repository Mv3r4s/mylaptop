package Objects;

public class aminal {
    String animalName;
    String typeOfAnimal;
    boolean isAnimal;
    Boolean isCarnivore;
    int age;
    String habitat;

    public void eat() {
        System.out.println("Animal eat other animal" + typeOfAnimal);
    }

    public void sleep() {
        System.out.println("sleep overnight" + typeOfAnimal);
    }

    public void play() {
        System.out.println(animalName + " play with other animal " + isAnimal);
    }

}


