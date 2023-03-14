package Objects;

public class zoo {

        public static void main(String[] args) {

            aminal animal1 = new aminal();
            animal1.animalName="doris";
            animal1.typeOfAnimal="fish";
            animal1.isAnimal=true;
            animal1.isCarnivore= false;
            animal1.age= 45;
            animal1.habitat= "ocean";

            aminal animal2 = new aminal();
            animal2.animalName="scooby";
            animal2.typeOfAnimal="god";
            animal2.isAnimal=true;
            animal2.isCarnivore= false;
            animal2.age= 34;
            animal2.habitat= "house";

            animal1.eat();
            animal1.sleep();
            animal2.play();
    }
}
